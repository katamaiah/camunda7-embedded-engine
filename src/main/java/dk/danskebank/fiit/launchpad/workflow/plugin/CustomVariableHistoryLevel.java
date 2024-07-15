package dk.danskebank.fiit.launchpad.workflow.plugin;

import org.camunda.bpm.engine.impl.history.HistoryLevel;
import org.camunda.bpm.engine.impl.history.event.HistoryEventType;
import org.camunda.bpm.engine.impl.history.event.HistoryEventTypes;
import org.camunda.bpm.engine.runtime.VariableInstance;

import java.util.ArrayList;
import java.util.List;

public class CustomVariableHistoryLevel implements HistoryLevel {

    public static final CustomVariableHistoryLevel INSTANCE = new CustomVariableHistoryLevel();

    protected static final List<HistoryEventType> VARIABLE_EVENT_TYPES = new ArrayList<HistoryEventType>();

    static {
        VARIABLE_EVENT_TYPES.add(HistoryEventTypes.VARIABLE_INSTANCE_CREATE);
        VARIABLE_EVENT_TYPES.add(HistoryEventTypes.VARIABLE_INSTANCE_UPDATE);
        VARIABLE_EVENT_TYPES.add(HistoryEventTypes.VARIABLE_INSTANCE_DELETE);
    }

    public static CustomVariableHistoryLevel getInstance() {
        return INSTANCE;
    }

    public int getId() {
        return 11;
    }

    public String getName() {
        return "custom-variable";
    }

    public boolean isHistoryEventProduced(HistoryEventType historyEventType, Object entity) {
        return !VARIABLE_EVENT_TYPES.contains(historyEventType)
                || isVariableEventProduced((VariableInstance) entity);
    }

    protected boolean isVariableEventProduced(VariableInstance variableInstance) {
        return variableInstance == null || variableInstance.getName().endsWith("-hist");
    }

}

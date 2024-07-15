package dk.danskebank.fiit.launchpad.workflow.handlers;
import java.util.List;
import java.util.logging.Logger;

import org.camunda.bpm.engine.impl.history.event.HistoryEvent;
import org.camunda.bpm.engine.impl.history.handler.HistoryEventHandler;


public class CustomHistoryEventHandler implements HistoryEventHandler {

    private final Logger LOGGER = Logger.getLogger(CustomHistoryEventHandler.class.getName());

    private static final CustomHistoryEventHandler INSTANCE = new CustomHistoryEventHandler();

    public static CustomHistoryEventHandler getInstance(){
        return INSTANCE;
    }

    @Override
    public void handleEvent(HistoryEvent historyEvent) {

        LOGGER.info("----- Logger HISTORY EVENT PRODUCED: "+ historyEvent.toString());
        System.out.println("----- Logger HISTORY EVENT PRODUCED: "+ historyEvent.toString());

    }

    @Override
    public void handleEvents(List<HistoryEvent> historyEvents) {
        for (HistoryEvent historyEvent : historyEvents) {
            handleEvent(historyEvent);
        }
    }


}

package dk.danskebank.fiit.launchpad.workflow.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;

@Slf4j
@UtilityClass
public class LoggerUtil {

    public static void processInfo(DelegateExecution execution) {
        log.info("Process Instance Info: "
                + "activityName='" + execution.getCurrentActivityName() + "'"
                + ", businessKey=" + execution.getProcessBusinessKey()
                +", processInstanceId=" + execution.getProcessInstanceId());
    }
}

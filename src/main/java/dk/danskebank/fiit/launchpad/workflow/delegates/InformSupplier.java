package dk.danskebank.fiit.launchpad.workflow.delegates;

import dk.danskebank.fiit.launchpad.workflow.utils.LoggerUtil;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InformSupplier {

    public void reportMismatch(DelegateExecution execution) {
        LoggerUtil.processInfo(execution);
        log.info("Supplier has been notified for Mismatch in data");
    }

    public void reportError(DelegateExecution execution) {
        LoggerUtil.processInfo(execution);
        log.info("Supplier has been notified for error with following reason : {}", execution.getVariable("l1remarks"));
    }
}
package dk.danskebank.fiit.launchpad.workflow.delegates;

import dk.danskebank.fiit.launchpad.workflow.utils.LoggerUtil;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ValidateInvoice implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        LoggerUtil.processInfo(execution);
        log.info("Invoice Validated");
    }
}
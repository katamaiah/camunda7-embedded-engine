package dk.danskebank.fiit.launchpad.workflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableProcessApplication()
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }

}
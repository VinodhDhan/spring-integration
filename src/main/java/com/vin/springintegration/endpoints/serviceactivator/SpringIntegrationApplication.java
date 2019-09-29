package com.vin.springintegration.endpoints.serviceactivator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import com.vin.springintegration.endpoints.serviceactivator.PrinterGateway;


@SpringBootApplication
@ImportResource("integration-context-serviceactivator.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private PrinterGateway printerGateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {

        Person[] payloads = {new Person("Kevin", "Bowersox"), new Person("John", "Doe")};
        for (int x = 0; x < payloads.length; x++) {
            Message<?> message = MessageBuilder.withPayload(payloads[x]).setHeader("replyChannel", "outputChannel")
                    .build();
            this.printerGateway.print(message);
        }


    }


}

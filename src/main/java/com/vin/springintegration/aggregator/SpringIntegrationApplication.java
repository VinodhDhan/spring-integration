package com.vin.springintegration.aggregator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@ImportResource("integration-context-aggregator.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private PrinterGateway printerGateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {

        String[] payloads = {"John Snow", "Meghan Markle", "Tom Cruise", "Andrew Simons"};

        for (int x = 0; x < payloads.length; x++) {
            Message<?> message = MessageBuilder.withPayload(payloads[x]).build();
            this.printerGateway.print(message);
        }


    }
}


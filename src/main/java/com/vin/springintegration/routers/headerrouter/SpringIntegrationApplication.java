package com.vin.springintegration.routers.headerrouter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import com.vin.springintegration.routers.headerrouter.PrinterGateway;

@SpringBootApplication
@ImportResource("integration-context-headerrouter.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    public PrinterGateway printerGateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {

        for (int x = 0; x < 10; x++) {
            Message<?> message = MessageBuilder.withPayload(x).setHeader("routeHeader", "string").build();
            this.printerGateway.print(message);
        }


    }
}


package com.vin.springintegration.channels.prioritychannel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@SpringBootApplication
@ImportResource("integration-context-prioritychannel.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private PrinterGateway printerGateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {

        List<Future<Message<String>>> futures = new ArrayList<Future<Message<String>>>();

        for (int x = 0; x < 10; x++) {

            // this is one way of setting priority
//            Message<String> message = MessageBuilder.withPayload("Printing message payload "+ x)
//                                                    .setHeader("messageNumber",x)
//                                                    .setPriority(x).build();

            Message<String> message = MessageBuilder.withPayload("Printing message payload " + x)
                    .setHeader("messageNumber", x)
                    .build();


            System.out.println("Sending message " + x);
            futures.add(this.printerGateway.print(message));
        }

        for (Future<Message<String>> future : futures) {
            System.out.println(future.get().getPayload());
        }

    }


}

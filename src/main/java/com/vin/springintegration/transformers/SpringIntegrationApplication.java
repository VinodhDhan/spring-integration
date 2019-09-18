package com.vin.springintegration.transformers;

import com.vin.springintegration.transformers.PrinterGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@SpringBootApplication
@ImportResource("integration-context-transformers.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private PrinterGateway printerGateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {

        //String[] payloads= {"Kevin Williamson", "Adam Ghilchrist","John Doe"};

        Person[] payloads = {new Person("Kevin", "Williamson"), new Person("Adam", "Ghilchrist"), new Person("John", "Doe")};


        for (int x = 0; x < payloads.length; x++) {
            Message<?> message = MessageBuilder.withPayload(payloads[x]).setHeader("privateKey", "123456").build();
            this.printerGateway.print(message);
        }

    }


}

package com.vin.jmsintegration.jmsinboundgateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.ExecutionException;


@SpringBootApplication
@ImportResource("integration-context-jmsinboundgateway.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private PersonGateway gateway;

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments arg0) throws InterruptedException, ExecutionException {
        Person person = new Person(4, "Jane", "Doe");
        this.gateway.save(person);
        System.out.println("Message has been sent");
    }


}

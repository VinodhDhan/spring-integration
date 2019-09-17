package com.vin.springintegrationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration-context-demo.xml")
public class SpringIntegrationDemoApplication implements ApplicationRunner {

    @Autowired
    private CustomGateway gateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationDemoApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {
        //System.out.println(arg0.getSourceArgs());
        gateway.print("Hello World");
    }


}

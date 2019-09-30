package com.vin.httpintegration.httpinboundgateway;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("integration-context-httpinboundgateway.xml")
public class SpringIntegrationApplication implements ApplicationRunner {


    // After running this program, just type http://localhost:8080 in browser to see output in IDE console
    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {


    }


}

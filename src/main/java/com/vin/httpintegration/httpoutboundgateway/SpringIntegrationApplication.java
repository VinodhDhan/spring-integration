package com.vin.httpintegration.httpoutboundgateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("integration-context-httpoutboundgateway.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private SimpleGateway simpleGateway;


    // After running this program, just type http://localhost:8080 in browser to see output in IDE console
    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {
        this.simpleGateway.execute("Anything");

    }


}

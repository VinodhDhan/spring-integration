package com.vin.springintegration.endpoints.gateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("integration-context-gateway.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private EnhancedPrinterGateway enhancedPrinterGateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {

        Person[] payloads = {new Person("Kevin", "Bowersox"), new Person("John", "Doe")};
        for (int x = 0; x < payloads.length; x++) {
            this.enhancedPrinterGateway.print(payloads[x]);
            //   System.out.println(this.enhancedPrinterGateway.upperCase(payloads[x]));
        }


    }


}

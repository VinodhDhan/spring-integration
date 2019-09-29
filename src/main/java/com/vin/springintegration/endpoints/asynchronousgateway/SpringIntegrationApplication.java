package com.vin.springintegration.endpoints.asynchronousgateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;


@SpringBootApplication
@ImportResource("integration-context-asynchronousgateway.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private EnhancedPrinterGateway enhancedPrinterGateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {

        Person[] payloads = {new Person("Kevin", "Bowersox"), new Person("John", "Doe")};
        for (int x = 0; x < payloads.length; x++) {

            System.out.println("Invoking the gateway method");

            ListenableFuture<String> future = this.enhancedPrinterGateway.upperCase(payloads[x]);

            future.addCallback(new ListenableFutureCallback<String>() {
                @Override
                public void onFailure(Throwable ex) {

                }

                @Override
                public void onSuccess(String result) {
                    System.out.println("Invoking success callback");
                    System.out.println(result);
                }
            });
        }


    }


}

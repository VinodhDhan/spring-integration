package com.vin.jdbcintegration.outboundjdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("integration-context-outboundjdbcintegrator.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private PersonGateway personGateway;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {
        Person person = new Person(4, "Jane", "Doe");
        this.personGateway.save(person);

    }


}

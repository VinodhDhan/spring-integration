package com.vin.springintegration.endpoints.asynchronousgateway;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UpperClassService {

    public String execute(Person person) {

        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return (person.getFirstName() + " " + person.getLastName()).toUpperCase();
    }
}

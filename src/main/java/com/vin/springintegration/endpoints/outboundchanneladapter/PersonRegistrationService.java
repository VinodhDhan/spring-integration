package com.vin.springintegration.endpoints.outboundchanneladapter;

public class PersonRegistrationService {

    public void registerEmail(Person person) {
        System.out.println("Email created for " + person.getFirstName());
    }
}

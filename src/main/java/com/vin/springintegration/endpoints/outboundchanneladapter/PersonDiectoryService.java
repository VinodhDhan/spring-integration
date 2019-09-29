package com.vin.springintegration.endpoints.outboundchanneladapter;

public class PersonDiectoryService {

    public Person findNewPeople() {

        System.out.println("Inbound adapter has polled for this service ");
        return new Person("Jan", "Doe");
    }
}

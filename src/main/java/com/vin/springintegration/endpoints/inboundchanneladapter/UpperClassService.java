package com.vin.springintegration.endpoints.inboundchanneladapter;

public class UpperClassService {

    public String execute(Person person) {
        return (person.getFirstName() + " " + person.getLastName()).toUpperCase();
    }
}

package com.vin.springintegration.endpoints.serviceactivator;

public class UpperClassService {

    public String execute(Person person) {
        return (person.getFirstName() + " " + person.getLastName()).toUpperCase();
    }
}

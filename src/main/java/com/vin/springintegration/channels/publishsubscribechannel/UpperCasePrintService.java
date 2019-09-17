package com.vin.springintegration.channels.publishsubscribechannel;


import org.springframework.messaging.Message;

public class UpperCasePrintService {

    public void print(Message<String> message) {
        System.out.println(message.getPayload().toUpperCase());
    }
}

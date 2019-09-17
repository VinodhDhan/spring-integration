package com.vin.springintegration.channels.directchannel;


import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

public class PrintService {

    public void print(Message<String> message) {
        System.out.println(message.getPayload());
    }
}

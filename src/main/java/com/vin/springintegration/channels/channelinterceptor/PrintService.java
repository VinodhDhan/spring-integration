package com.vin.springintegration.channels.channelinterceptor;


import org.springframework.messaging.Message;

public class PrintService {

    public void print(Message<String> message) {
        System.out.println(message.getPayload());
    }
}

package com.vin.jmsintegration.jmsmessagedrivenadapter;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public void print(Message<?> message) {
        System.out.println("Printing the message");
        System.out.println(message);
    }

}

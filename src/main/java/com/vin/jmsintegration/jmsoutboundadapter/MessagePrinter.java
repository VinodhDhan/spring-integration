package com.vin.jmsintegration.jmsoutboundadapter;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public void print(Message<?> message) {
        System.out.println(message);
    }

}

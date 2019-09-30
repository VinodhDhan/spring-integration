package com.vin.jmsintegration.jmsoutboundgateway;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public String print(Message<?> message) {
        return "From inbound gateway - 1 message";
    }

    public void printConsole(Message<?> message) {
        System.out.println("Message was passed to print console from outbound gateway");
        System.out.println(message);
    }

}

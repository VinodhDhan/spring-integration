package com.vin.jdbcintegration.outboundjdbcgateway;

import org.springframework.messaging.Message;


public class MessagePrinter {

    public void print(Message<?> message) {
        System.out.println(message);
    }

}


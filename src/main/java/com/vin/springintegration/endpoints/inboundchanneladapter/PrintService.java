package com.vin.springintegration.endpoints.inboundchanneladapter;


import org.springframework.messaging.Message;

import java.util.Map.Entry;

public class PrintService {

    public void print(Message<?> message) {
        System.out.println(message.getPayload());

        for (Entry<String, Object> entry : message.getHeaders().entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}


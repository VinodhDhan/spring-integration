package com.vin.springintegration.routers.recipientlist;

import org.springframework.messaging.Message;

public class DefaultService {

    public void print(Message<?> message) {
        System.out.println("Print from the default service");
    }
}

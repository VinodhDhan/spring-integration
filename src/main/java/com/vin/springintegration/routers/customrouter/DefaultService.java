package com.vin.springintegration.routers.customrouter;

import org.springframework.messaging.Message;

public class DefaultService {

    public void print(Message<?> message) {
        System.out.println("Print from the default service");
    }
}

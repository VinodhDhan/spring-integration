package com.vin.springintegration.routers.customrouter;

import org.springframework.messaging.Message;

public interface PrinterGateway {

    public void print(Message<?> message);
}

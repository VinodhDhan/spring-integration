package com.vin.springintegration.routers.payloadrouter;

import org.springframework.messaging.Message;

public interface PrinterGateway {

    public void print(Message<?> message);
}

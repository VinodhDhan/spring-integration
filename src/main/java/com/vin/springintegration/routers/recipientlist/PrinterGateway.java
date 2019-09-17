package com.vin.springintegration.routers.recipientlist;

import org.springframework.messaging.Message;

public interface PrinterGateway {

    public void print(Message<?> message);
}

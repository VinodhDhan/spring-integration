package com.vin.springintegration.routers.headerrouter;

import org.springframework.messaging.Message;

public interface PrinterGateway {

    public void print(Message<?> message);
}

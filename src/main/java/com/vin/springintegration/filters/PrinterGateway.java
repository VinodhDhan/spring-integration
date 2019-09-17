package com.vin.springintegration.filters;

import org.springframework.messaging.Message;

public interface PrinterGateway {

    public void print(Message<?> message);
}

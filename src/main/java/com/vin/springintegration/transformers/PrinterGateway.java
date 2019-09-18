package com.vin.springintegration.transformers;

import org.springframework.messaging.Message;

public interface PrinterGateway {

    public void print(Message<?> message);
}

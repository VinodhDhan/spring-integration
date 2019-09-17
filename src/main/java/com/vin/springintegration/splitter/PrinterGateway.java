package com.vin.springintegration.splitter;

import org.springframework.messaging.Message;

public interface PrinterGateway {

    public void print(Message<?> message);
}

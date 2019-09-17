package com.vin.springintegration.aggregator;

import org.springframework.messaging.Message;

public interface PrinterGateway {

    public void print(Message<?> message);
}

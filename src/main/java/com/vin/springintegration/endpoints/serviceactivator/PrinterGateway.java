package com.vin.springintegration.endpoints.serviceactivator;

import org.springframework.messaging.Message;


public interface PrinterGateway {

    public void print(Message<?> message);

}


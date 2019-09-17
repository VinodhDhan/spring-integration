package com.vin.springintegration.channels.queuechannels;

import org.springframework.messaging.Message;

import java.util.concurrent.Future;

public interface PrinterGateway {

    public Future<Message<String>> print(Message<?> message);
}

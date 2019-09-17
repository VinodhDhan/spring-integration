package com.vin.springintegration.channels.queuechannels;


import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

public class PrintService {

    public Message print(Message<String> message) {
        System.out.println(message.getPayload());
        MessageHeaders headers = message.getHeaders();
        int messageNumber = (int) message.getHeaders().get("messageNumber");
        return MessageBuilder.withPayload("Sending reply message with number  " + messageNumber).build();
    }
}

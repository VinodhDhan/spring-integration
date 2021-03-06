package com.vin.springintegrationbasic;


import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Map;

public class PrintService {

    public Message print(Message<String> message) {
        MessageHeaders headers = message.getHeaders();
        for(Map.Entry<String,Object> entry:headers.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
     //   System.out.println(message.getPayload());

        return MessageBuilder.withPayload(message.getPayload()).build();
    }
}

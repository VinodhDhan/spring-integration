package com.vin.springintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private DirectChannel inputChannel;

//    @Autowired
//    DirectChannel outputChannel;


    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }


    public void run(ApplicationArguments arg0) throws Exception {

        // Sending message without channel example starts

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Key", "value");
        MessageHeaders headers = new MessageHeaders(map);
        Message message = new GenericMessage<String>("Hello World", headers);
        PrintService printService = new PrintService();
        printService.print(message);

        //Construct message using message builder
        Message messageBuilder = MessageBuilder.withPayload("Hello World from Build pattern")
                                                .setHeader("newHeader","newHeaderValue")
                                                .build();
        printService.print(messageBuilder);


        // Sending message without channel example starts

//        channel.subscribe(new MessageHandler() {
//            @Override
//            public void handleMessage(Message<?> message) throws MessagingException {
//                new PrintService().print((Message<String>) message);
//            }
//        });

//        outputChannel.subscribe(new MessageHandler() {
//            @Override
//            public void handleMessage(Message<?> message) throws MessagingException {
//                System.out.println(message.getPayload());
//            }
//        });

        Message messageBuilderwithChannel = MessageBuilder.withPayload("Hello World from Channel example")
                .setHeader("newHeader","newHeaderValue")
                .build();

      //  inputChannel.send(messageBuilderwithChannel);


        MessagingTemplate template = new MessagingTemplate();
        Message outputMessage = template.sendAndReceive(inputChannel, messageBuilderwithChannel);
        System.out.println(outputMessage.getPayload());

        // Sending message without channel example ends


    }


}

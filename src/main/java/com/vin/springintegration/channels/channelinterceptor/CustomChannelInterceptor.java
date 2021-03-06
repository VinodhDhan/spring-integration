package com.vin.springintegration.channels.channelinterceptor;


import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.ChannelInterceptorAdapter;
import org.springframework.messaging.support.MessageBuilder;

public class CustomChannelInterceptor extends ChannelInterceptorAdapter {
    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        Message<?> msg = MessageBuilder.withPayload(message.getPayload().toString() + " Message Intercepted ").build();
        return super.preSend(msg, channel);
    }
}

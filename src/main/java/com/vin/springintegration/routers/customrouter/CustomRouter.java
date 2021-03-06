package com.vin.springintegration.routers.customrouter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.util.ArrayList;
import java.util.Collection;

public class CustomRouter extends AbstractMessageRouter {

    @Autowired
    private MessageChannel intChannel;

    @Autowired
    private MessageChannel stringChannel;

    @Override
    protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
        Collection<MessageChannel> targetChannels = new ArrayList<MessageChannel>();

        if (message.getPayload().getClass().equals(Integer.class)) {
            ((ArrayList<MessageChannel>) targetChannels).add(intChannel);
        } else if (message.getPayload().getClass().equals(String.class)) {
            ((ArrayList<MessageChannel>) targetChannels).add(stringChannel);
        }

        return targetChannels;
    }
}

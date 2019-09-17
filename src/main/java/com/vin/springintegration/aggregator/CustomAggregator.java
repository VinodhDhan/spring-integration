package com.vin.springintegration.aggregator;

import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.integration.aggregator.AbstractAggregatingMessageGroupProcessor;
import org.springframework.integration.store.MessageGroup;
import org.springframework.messaging.Message;

import java.util.Map;

public class CustomAggregator extends AbstractAggregatingMessageGroupProcessor {
    @Override
    protected Object aggregatePayloads(MessageGroup messageGroup, Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Message<?> msg : messageGroup.getMessages()) {
            System.out.println(msg.getHeaders().get(IntegrationMessageHeaderAccessor.CORRELATION_ID));
            stringBuilder.append(msg.getPayload());
        }

        return stringBuilder.toString();

    }
}

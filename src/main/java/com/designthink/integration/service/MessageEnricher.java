package com.designthink.integration.service;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

public class MessageEnricher {

    public Message<String> enrichMessage(Message<String> message){
        return MessageBuilder.withPayload("Reply for message " + message.getHeaders().get("messageNo")).build();
    }
}



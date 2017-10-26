package com.greenfox.kaghee.messageservices.messageservices;

import com.greenfox.kaghee.messageservices.messageservices.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
    @Autowired
    MessageService service;

    public void processMessage(String message, String recipient) {
        service.sendMessage(message, recipient);
    }
}

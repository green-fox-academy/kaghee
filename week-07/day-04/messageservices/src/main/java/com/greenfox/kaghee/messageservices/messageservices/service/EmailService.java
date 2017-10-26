package com.greenfox.kaghee.messageservices.messageservices.service;

public class EmailService implements MessageService {
    public EmailService() {
    }

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to " + recipient + " with message = " + message);
    }
}

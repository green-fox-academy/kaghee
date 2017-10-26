package com.greenfox.kaghee.messageservices.messageservices.config;

import com.greenfox.kaghee.messageservices.messageservices.MessageProceeder;
import com.greenfox.kaghee.messageservices.messageservices.service.EmailService;
import com.greenfox.kaghee.messageservices.messageservices.service.MessageService;
import com.greenfox.kaghee.messageservices.messageservices.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public MessageService service() {
        return new EmailService();
    }

    public MessageService service1() {
        return new TwitterService();
    }

    @Bean
    public MessageProceeder proceeder() {
        return new MessageProceeder();
    }
}

package com.greenfox.kaghee.reddit.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoteConfig {

    @Bean
    public VotingService votingService() {
        return new VotingService();
    }
}

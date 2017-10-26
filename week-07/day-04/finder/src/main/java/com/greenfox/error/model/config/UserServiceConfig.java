package com.greenfox.error.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.greenfox.error.model.service.UserService;

@Configuration
public class UserServiceConfig {

    @Bean
    public UserService service() {
        return new UserService();
    }
}

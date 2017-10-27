package com.greenfox.kaghee.foxclub.foxclub.config;

import com.greenfox.kaghee.foxclub.foxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public Fox fox() {
        return new Fox();
    }
}

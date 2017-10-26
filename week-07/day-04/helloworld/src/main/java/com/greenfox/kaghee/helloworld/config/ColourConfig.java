package com.greenfox.kaghee.helloworld.config;

import com.greenfox.kaghee.helloworld.BlueColour;
import com.greenfox.kaghee.helloworld.HelloWorld;
import com.greenfox.kaghee.helloworld.MyColor;
import com.greenfox.kaghee.helloworld.RedColour;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColourConfig {

    @Bean
    public RedColour redColour() {
        return new RedColour();
    }

    @Bean
    public BlueColour blueColour() {
        return new BlueColour();
    }
}

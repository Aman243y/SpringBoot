package com.example.SpringCore.config;

import com.example.SpringCore.Common.Coach;
import com.example.SpringCore.Common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    @Bean
    Coach swimCoach(){
        return new SwimCoach();
    }
}

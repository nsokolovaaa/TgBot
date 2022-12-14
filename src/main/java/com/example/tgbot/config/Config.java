package com.example.telegrambot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("application.properties")
public class Config {
    @Value("${bot.name}")
    String name;

    @Value("${bot.token}")
    String token;
}

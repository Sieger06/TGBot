package com.example.tgbot.Config;

import com.pengrad.telegrambot.TelegramBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TelegramBotConfig {
    @Bean
public TelegramBot telegramBot(@Value("${6386908306:AAEiA9AKkdpx6xhQ5P7hYQjquu39faTDhUY}") String token){
    return new TelegramBot(token);
    }
}
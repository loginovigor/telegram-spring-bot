package io.project.SpringDemoBot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import org.springframework.beans.factory.annotation.Value;


@Configuration
@Data
@ConfigurationProperties(prefix = "application.properties")
public class BotConfig {

    @Value("${bot.name}")
    String botName;

    @Value("${bot.token}")
    String token;
}

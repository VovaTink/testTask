package ru.tinkoff.edu.java.bot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
public record BotConfig(@NotNull String test) {
}

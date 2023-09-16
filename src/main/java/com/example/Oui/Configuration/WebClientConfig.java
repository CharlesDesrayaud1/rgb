package com.example.Oui.Configuration;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    private WebClient webClient;
    private static final String URL = "https://raw.githubusercontent.com/CharlesDesrayaud1/rgb/main/src/main/resources/Event2.json";

    @Bean
    public WebClient getWebClient() {
        return WebClient.builder()
                .baseUrl(URL)
                .build();
    }
}
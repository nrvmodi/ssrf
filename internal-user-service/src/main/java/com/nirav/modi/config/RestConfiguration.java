package com.nirav.modi.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
@Slf4j
public class RestConfiguration {

    @Bean
    @Primary
    public RestTemplate getRestTemplate() {
        RestTemplate template = new RestTemplateBuilder().build();
        return template;
    }
}

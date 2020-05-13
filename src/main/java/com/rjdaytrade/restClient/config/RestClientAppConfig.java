package com.rjdaytrade.restClient.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.rjdaytrade.model.exception.RestTemplateErrorHandler;

import java.time.Duration;

@Configuration
@ComponentScan("com.rjdaytrade.restClient.client")
public class RestClientAppConfig {
	
	@Bean
    public RestTemplate restTemplate() {
		RestTemplateBuilder builder = new RestTemplateBuilder()
				.setConnectTimeout(Duration.ofMillis(3000000))
                .setReadTimeout(Duration.ofMillis(3000000))
                .errorHandler(new RestTemplateErrorHandler());
        
		return builder.build();
    }
}

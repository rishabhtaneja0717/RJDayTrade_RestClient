package com.rjdaytrade.restClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.rjdaytrade.restClient", "com.rjdaytrade.restClient.client"})
@EntityScan(basePackages =  {"com.rjdaytrade.model"})
public class RjDaytradeRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RjDaytradeRestClientApplication.class, args);
	}

}

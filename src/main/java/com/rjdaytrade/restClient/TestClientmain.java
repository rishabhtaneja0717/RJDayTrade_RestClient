package com.rjdaytrade.restClient;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rjdaytrade.model.Role;
import com.rjdaytrade.restClient.client.RoleClient;
import com.rjdaytrade.restClient.client.UserClient;
import com.rjdaytrade.restClient.config.RestClientAppConfig;

public class TestClientmain {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				RestClientAppConfig.class)) {

			UserClient client = applicationContext.getBean(UserClient.class);

			try {
				client.getUserByEmail("aaaa");
			} catch (Exception e) {
				System.out.println("\n\n -----> Exception :: " + e.getMessage());
			}

		}
	}

}

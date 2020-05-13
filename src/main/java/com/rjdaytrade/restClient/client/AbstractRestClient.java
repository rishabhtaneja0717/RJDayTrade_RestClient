package com.rjdaytrade.restClient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.rjdaytrade.restClient.property.PropertyReader;
import static com.rjdaytrade.restClient.property.RestClientConstants.BASE_URI_KEY;

public abstract class AbstractRestClient {
	
	@Autowired
	RestTemplate restTemplate;
	
	protected  final String BASE_URI = PropertyReader.getInstance().getProperty(BASE_URI_KEY);
}

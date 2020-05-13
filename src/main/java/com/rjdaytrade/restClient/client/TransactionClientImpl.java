package com.rjdaytrade.restClient.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rjdaytrade.model.Transaction;

@Service
public class TransactionClientImpl extends AbstractRestClient implements TransactionClient {

	@Override
	public List<Transaction> getTodaysTransactions(Long id) {
		
		ResponseEntity<Transaction[]> response = restTemplate.getForEntity(BASE_URI + "transactions/today/" + id, Transaction[].class);
		return Arrays.asList(response.getBody());
	}
	
}

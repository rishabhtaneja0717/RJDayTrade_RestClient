package com.rjdaytrade.restClient.client;

import java.util.List;

import com.rjdaytrade.model.Transaction;

public interface TransactionClient {
	
	List<Transaction> getTodaysTransactions(Long id);
}

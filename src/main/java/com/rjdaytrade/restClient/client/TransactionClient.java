package com.rjdaytrade.restClient.client;

import java.util.Date;
import java.util.List;

import com.rjdaytrade.model.Transaction;
import com.rjdaytrade.model.dashboard.GainSummary;

public interface TransactionClient {
	
	List<Transaction> getTodaysTransactions(Long id);
	
    GainSummary getRealMonthTransactionsAfterDate(Long id, Integer month, Date date);
}

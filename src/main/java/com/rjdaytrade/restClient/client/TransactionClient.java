package com.rjdaytrade.restClient.client;

import java.util.List;

import com.rjdaytrade.model.Transaction;
import com.rjdaytrade.model.dashboard.GainSummary;

public interface TransactionClient {
	
	List<Transaction> getTodaysTransactions(Long id);
	
	List<Transaction> getRealDaysTransactions(Long id, Integer daysInterval, Integer limit);
	
	List<Transaction> getRealDaysTransactions(Long id, Integer daysInterval);
	
    GainSummary getRealDaysSummary(Long id, Integer daysInterval);
    
    List<GainSummary> getRealDaysGroupedSummary(Long id, Integer daysInterval);
}

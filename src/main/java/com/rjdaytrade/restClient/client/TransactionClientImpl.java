package com.rjdaytrade.restClient.client;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rjdaytrade.model.Transaction;
import com.rjdaytrade.model.dashboard.GainSummary;

@Service
public class TransactionClientImpl extends AbstractRestClient implements TransactionClient {

	@Override
	public List<Transaction> getTodaysTransactions(Long id) {
		
		ResponseEntity<Transaction[]> response = restTemplate.getForEntity(BASE_URI + "transactions/real/today/" + id, Transaction[].class);
		return Arrays.asList(response.getBody());
	}
	
	@Override
	public GainSummary getRealMonthTransactionsAfterDate(Long id, Integer month, Date date) {
		String strDate = new SimpleDateFormat("MM-dd-yyyy").format(date);
		
		ResponseEntity<GainSummary> response = restTemplate.getForEntity(BASE_URI + "transactions/real/month/after/" + id +"/" + month + "/" + strDate, 
				GainSummary.class);
		
		return response.getBody();
	}
	
}

package com.rjdaytrade.restClient.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rjdaytrade.model.Transaction;
import com.rjdaytrade.model.dashboard.GainSummary;

@Service
public class TransactionClientImpl extends AbstractRestClient implements TransactionClient {

	@Override
	public List<Transaction> getTodaysTransactions(Long id) {

		ResponseEntity<Transaction[]> response = restTemplate.getForEntity(BASE_URI + "transactions/real/today/" + id,
				Transaction[].class);
		return Arrays.asList(response.getBody());
	}

	@Override
	public GainSummary getRealDaysSummary(Long id, Integer daysInterval) {

		ResponseEntity<GainSummary> response = restTemplate.getForEntity(
				BASE_URI + "/transactions/real/daysSummary/" + id + "/" + daysInterval.toString(), GainSummary.class);

		return response.getBody();
	}

}

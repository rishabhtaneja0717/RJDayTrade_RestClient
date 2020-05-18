package com.rjdaytrade.restClient.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rjdaytrade.model.TransactionType;
import com.rjdaytrade.model.UserAccountInfo;

@Service
public class UserAccountInfoClientImpl extends AbstractRestClient implements UserAccountInfoClient {

	@Override
	public UserAccountInfo getUserAccountInfo(Long userId, TransactionType transactionType) {
		ResponseEntity<UserAccountInfo> response = restTemplate.getForEntity(
				BASE_URI + "userAccountInfo/" + transactionType.name().toLowerCase() + "/" + userId.toString(),
				UserAccountInfo.class);
		return response.getBody();
	}

}

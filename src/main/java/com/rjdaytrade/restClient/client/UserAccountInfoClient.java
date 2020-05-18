package com.rjdaytrade.restClient.client;

import com.rjdaytrade.model.TransactionType;
import com.rjdaytrade.model.UserAccountInfo;;

public interface UserAccountInfoClient {
	
	public UserAccountInfo getUserAccountInfo(Long userId, TransactionType transactionType);
	
}

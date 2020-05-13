package com.rjdaytrade.restClient.client;

import com.rjdaytrade.model.User;

public interface UserClient {

	public User getUserByEmail(String email);

	public Boolean isUserExistsByEmail(String email);
	
	public Boolean isUserExistsById(Long id);
	
	public User updateUser(User user, String email);
	
	public User updateUser(User user);
	
	public User addUser(User user);
	
}

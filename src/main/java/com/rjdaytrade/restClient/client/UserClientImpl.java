package com.rjdaytrade.restClient.client;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rjdaytrade.model.User;

@Service
public class UserClientImpl extends AbstractRestClient implements UserClient{

	@Override
	public User getUserByEmail(String email) {
		ResponseEntity<User> response = restTemplate.getForEntity(BASE_URI + "users/" + email, User.class);
		return response.getBody();
	}

	@Override
	public Boolean isUserExistsByEmail(String email) {
		ResponseEntity<Boolean> response = restTemplate.getForEntity(BASE_URI + "users/exists/email/" + email, Boolean.class);
		return response.getBody();
	}
	
	@Override
	public Boolean isUserExistsById(Long id) {
		ResponseEntity<Boolean> response = restTemplate.getForEntity(BASE_URI + "users/exists/id/" + id, Boolean.class);
		return response.getBody();
	}

	@Override
	public User updateUser(User user, String email) {
		String url = BASE_URI + "users/" + email;
		return updateUserForUrl(user, url);  
	}
	
	@Override
	public User updateUser(User user) {
		String url = BASE_URI + "users/";
		return updateUserForUrl(user, url);  
	}
	
	private User updateUserForUrl(User user, String url) {
		System.out.println("\n\n ------> updateUserForUrl called");
		// create headers
	    HttpHeaders headers = new HttpHeaders();
	    
	    // set `accept` header
	    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	    
	    // set `accept` header
	    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

	    // build the request
	    HttpEntity<User> entity = new HttpEntity<>(user, headers);

	    // send PUT request to update post with `id` 10
	    ResponseEntity<User> response = this.restTemplate.exchange(url, HttpMethod.PUT, entity, User.class);

	    // check response status code
	    if (response.getStatusCode() == HttpStatus.OK) {
	    	System.out.println("\n\n Returned response :: " + response.getBody().toString());
	        return response.getBody();
	    } else {
	        return null;
	    }   
	}

	@Override
	public User addUser(User user) {
		User resultUser = restTemplate.postForObject(BASE_URI + "users", user, User.class);
		return resultUser;
	}
}

package com.rjdaytrade.restClient.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rjdaytrade.model.Role;

@Service
public class RoleClientImpl extends AbstractRestClient implements RoleClient{

	@Override
	public Role getRole(String name) {
		ResponseEntity<Role> response = restTemplate.getForEntity(BASE_URI + "roles/" + name, Role.class);
		return response.getBody();
	}

	@Override
	public Role updateRole(Role role) {		
		String name = role.getName();
		restTemplate.put(BASE_URI + "roles/" + name, role);
		
		return role;
	}

}

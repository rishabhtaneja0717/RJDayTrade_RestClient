package com.rjdaytrade.restClient.client;

import com.rjdaytrade.model.Role;

public interface RoleClient {
	
	public Role getRole(String name);
	
	public Role updateRole(Role role);

}

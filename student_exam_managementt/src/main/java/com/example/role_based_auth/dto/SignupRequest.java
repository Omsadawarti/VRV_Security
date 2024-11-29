package com.example.role_based_auth.dto;

import java.util.Set;

public class SignupRequest {
    private String username;
    private String password;
    private Set<String> roles; // e.g., ["ROLE_ADMIN", "ROLE_USER"]
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	public SignupRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}

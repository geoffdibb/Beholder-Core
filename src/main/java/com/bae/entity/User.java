package com.bae.entity;

public class User {

	private String username;
	private long id;
	private String password;

	public User(String username, long id, String password) {
		this.username = username;
		this.id = id;
		this.password = password;
	}

	public User() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

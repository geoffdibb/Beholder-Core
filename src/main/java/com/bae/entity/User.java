package com.bae.entity;

public class User {

	private String username;
	private long id;

	public User(String username, long id) {
		this.username = username;
		this.id = id;
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

}

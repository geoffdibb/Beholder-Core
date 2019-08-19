package com.bae.entity;

import java.util.Date;

public class AuditSearchLog {

	private String username;
	private Long id;
	private Date timeStamp;
	private String searchTerm;

	public AuditSearchLog(String username, Long id, String searchTerm) {
		this.username = username;
		this.id = id;
		this.timeStamp =  new Date();
		this.searchTerm = searchTerm;
	}

	public AuditSearchLog() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

}

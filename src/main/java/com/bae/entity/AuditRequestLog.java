package com.bae.entity;

import java.util.Date;

public class AuditRequestLog {

	private String username;
	private long id;
	private Date timeStamp;

	public AuditRequestLog(String username, long id) {
		this.username = username;
		this.id = id;
		this.timeStamp =  new Date();
	} 

	public AuditRequestLog() {
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

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}

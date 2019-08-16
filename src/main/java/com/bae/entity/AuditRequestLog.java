package com.bae.entity;

import java.util.Date;

public class AuditRequestLog {

	private String username;
	private Long id;
	private Date timeStamp;

	public AuditRequestLog(String username, Long id, Date timeStamp) {
		this.username = username;
		this.id = id;
		this.timeStamp = timeStamp;
	} 

	public AuditRequestLog() {
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

}

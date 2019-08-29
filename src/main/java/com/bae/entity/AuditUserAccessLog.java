package com.bae.entity;

import java.util.Date;

public class AuditUserAccessLog {

	private String username;
	private Date timeStamp;

	public AuditUserAccessLog(String username) {
		this.username = username;
		this.timeStamp = new Date();
	}

	public AuditUserAccessLog() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}

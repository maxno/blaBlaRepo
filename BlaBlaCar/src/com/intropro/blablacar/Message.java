package com.intropro.blablacar;

import java.util.Date;

public class Message {
	
	private Profile from;
	private Profile to;
	private Date date = new Date();
	private String body;
	
	public Message(Profile to, Profile from, String body){
	
	this.to = to;
	this.from = from;
	this.body = body;
	sendMessage();
	notyfyRecivier();
	
	}
	
	private void sendMessage() {
		to.getMessages().add(this);
	}
	
	private void notyfyRecivier() {
		to.setMessageCounter(to.getMessageCounter() + 1);
	}

	public Profile getFrom() {
		return from;
	}

	public void setFrom(Profile from) {
		this.from = from;
	}

	public Profile getTo() {
		return to;
	}

	public void setTo(Profile to) {
		this.to = to;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}

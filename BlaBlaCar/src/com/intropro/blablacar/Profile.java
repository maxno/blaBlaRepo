package com.intropro.blablacar;

import java.util.ArrayList;
import java.util.List;

public class Profile {

	private String firstName = "123";
	private String lastName  = "123";
	private String phone  = "123";
	private String email  = "123";
	private List<Notification> notifications = new ArrayList<Notification>();
	private int notificationCounter = 0;
	private List<Message> messages = new ArrayList<Message>();
	private int messageCounter = 0;
	
	public void update(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public int getNotificationCounter() {
		return notificationCounter;
	}

	public void setNotificationCounter(int notificationCounter) {
		this.notificationCounter = notificationCounter;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public int getMessageCounter() {
		return messageCounter;
	}

	public void setMessageCounter(int messageCounter) {
		this.messageCounter = messageCounter;
	}
	
}

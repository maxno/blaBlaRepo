package com.intropro.blablacar;

public class Notification {

	Ride ride;
	Request request;
	
	public Notification(Ride ride, Request request){
		
		this.ride = ride;
		this.request = request;
		createNotification();
	}
	
	private void createNotification(){
		Profile profile = ride.getOwner();
		profile.getNotifications().add(this);
		profile.setNotificationCounter(profile.getNotificationCounter() + 1);
	}
	
	public void viewNotification(){
			getRide();
			getRequest();
	}
	
	public Ride getRide() {
		return ride;
	}

	public Request getRequest() {
		return request;
	}

	
	
	
}

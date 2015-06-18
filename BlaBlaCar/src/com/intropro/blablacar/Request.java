package com.intropro.blablacar;

public class Request {

	private Profile owner; 
	private String status;
	
	
	public Request(Ride ride, Profile requestOwner) {
		createRequest(ride);
		this.owner = requestOwner;
	}

	
	public void viewRequest(){  // move to Ride class
		
	}
	
	private void createRequest(Ride ride){
		ride.getRequests().add(this);
	}
	
	public void deleteRequest(Ride ride, Request reuest){
		
		ride.getRequests().remove(reuest); // move to Ride class
		
	}
	
	public void notifyRequest(){
		
	}

	public Profile getOwner() {
		return owner;
	}

	public void setOwner(Profile owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

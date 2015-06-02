package com.intropro.blablacar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RideList {
 
	private List<Ride> rides = new ArrayList<Ride>();
	
	public Ride createRide(String start, String finish, Date date, Profile owner){
		Ride ride = Ride.createRide(start, finish, date, owner);
		rides.add(ride);
		return ride;
	}
	
	
	private void search(){
		
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}


	
}

package com.intropro.blablacar;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideList {

	private List<Ride> rides = new ArrayList<Ride>();
	private List<HashMap<Integer, Ride>> ridesHashMap = new ArrayList<HashMap<Integer, Ride>>();

	public Ride createRide(String start, String finish, Date date, Profile owner) {
		Ride ride = Ride.createRide(start, finish, date, owner);
		rides.add(ride);
		return ride;
	}

	public String deleteRide(Ride ride) {

		rides.remove(ride);

		return "Deleted sucesfuly";
	}

	public List<Ride> search(Map<String, String> searchFields) {

		List<Ride> result = new ArrayList<Ride>();

		for (Ride ride : rides) {
			String coincidence = "no";
			HashMap listRideField = ride.fieldsToMap(ride);
			for (Map.Entry<String, String> entry : searchFields.entrySet()) {
				if (listRideField.get(entry.getKey()).equals(entry.getValue())) {
					coincidence = "yes";
					System.out.println("coincidence " + entry.getValue());
				}else{
					coincidence = "no";
					break;
				}
				
				
				}
			if(coincidence == "yes"){
				result.add(ride);
			}
		}

		return result;
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}

}

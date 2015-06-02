package com.intropro.blablacar;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ride {

	private String start;
	private String finish;
	private Date date;
	private String status;
	private Profile owner;
	private List<Comment> comments;
	private List<Request> requests;

	private Ride() {

	}

	public static Ride createRide(String start, String finish, Date date,
			Profile owner) {

		Ride ride = new Ride();
		ride.setStart(start);
		ride.setFinish(finish);
		ride.setDate(date);
		ride.setOwner(owner);
		ride.setStatus("active");
		return ride;
	}

	public Map<String, String> viewRide(Ride ride) {

		Map<String, String> rideParamsMap = new HashMap<String, String>();

		rideParamsMap.put("start", ride.getStart());
		rideParamsMap.put("finish", ride.getFinish());
		rideParamsMap.put("date", ride.getDate().toString());
		rideParamsMap.put("owner", owner.toString());

		return rideParamsMap;

	}

	public void deleteRide() {

	}
	
	public void updateRide(Ride ride, HashMap updatedParamsMap){
		
		mapToFilds(ride, updateRideParams(ride, updatedParamsMap));
	}

	public HashMap updateRideParams(Ride ride, HashMap<String, String> updatedParamsMap) {

		HashMap rideParamsMap = fieldsToMap(ride);
		
		if (!rideParamsMap.equals(updatedParamsMap)) {

			rideParamsMap.putAll(updatedParamsMap);

		}

		return rideParamsMap;

	}
	
	public HashMap fieldsToMap(Ride ride){
		
		Map<String, String> rideParamsMap = new HashMap<String, String>();

		rideParamsMap.put("start", ride.getStart());
		rideParamsMap.put("finish", ride.getFinish());
		rideParamsMap.put("date", ride.getDate().toString());
		rideParamsMap.put("owner", ride.owner.toString());

		return (HashMap) rideParamsMap;
	}
	
	public void mapToFilds(Ride ride, HashMap<String, String> rideParamsMap){
		
		ride.setStart(rideParamsMap.get("start"));
		ride.setStart(rideParamsMap.get("finish"));
		ride.setStart(rideParamsMap.get("date"));
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Profile getOwner() {
		return owner;
	}

	public void setOwner(Profile owner) {
		this.owner = owner;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

}

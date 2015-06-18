package com.intropro.blablacar;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class RequestTest {

	@Test
	public void creteRequestTest() {
		
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile owner = new Profile();

		Ride ride = Ride.createRide(start, finish, date, owner);
		
		Profile requestOwner = new Profile();
		Request request = new Request(ride, requestOwner);
		
		Assert.assertEquals(ride.getRequests().get(0), request);
	}
	
	@Test
	public void notifyReuestTest(){
		
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile owner = new Profile();

		Ride ride = Ride.createRide(start, finish, date, owner);
		Profile requestOwner = new Profile();
		Request request = new Request(ride, requestOwner);
		
		Notification notification = new Notification(ride, request);
		Notification notification1 = new Notification(ride, request);
		Assert.assertEquals(owner.getNotifications().get(0), notification);
		Assert.assertEquals(2, owner.getNotificationCounter());
	}

}

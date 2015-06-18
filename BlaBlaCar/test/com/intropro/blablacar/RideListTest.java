package com.intropro.blablacar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class RideListTest {

	@Test
	public void testCreateRide() {
		
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile profile = new Profile();
		RideList rideList = new RideList();

		Ride ride = rideList.createRide(start, finish, date, profile);
		
		assertNotNull(ride);
		assertTrue(!rideList.getRides().isEmpty());
		assertEquals(ride, rideList.getRides().get(0));
		
		Ride ride2 = rideList.createRide(start, finish, date, profile);
		
		assertEquals(2, rideList.getRides().size());
		assertEquals(ride2, rideList.getRides().get(1));
	}
	
	@Test
	public void testSearchByStart(){
		
		RideList rideList = new RideList();
		
		String start1 = "Cristal";
		String finish1 = "Grigorenko";
		Date date1 = new Date();
		Profile profile1 = new Profile();
		

		Ride ride1 = rideList.createRide(start1, finish1, date1, profile1);
		
		String start2 = "Grishko";
		String finish2 = "Grigorenko";
		Date date2 = new Date();
		Profile profile2 = new Profile();
		
		Ride ride2 = rideList.createRide(start2, finish2, date2, profile2);
		
		String start3 = "Cristal";
		String finish3 = "Odessa";
		Date date3 = new Date();
		Profile profile3 = new Profile();
		
		Ride ride3 = rideList.createRide(start3, finish3, date3, profile3);
		
		List<Ride> rides = new ArrayList<Ride>();
		rides.add(ride1);
		rides.add(ride3);
		
		Map<String, String> fields = new HashMap<String, String>();
		fields.put("start", "Cristal");
			
		
		Assert.assertEquals(rides, rideList.search(fields));
	}
	
	@Test
	public void testSearchByStartFinish(){
		
		RideList rideList = new RideList();
		
		String start1 = "Cristal";
		String finish1 = "Grigorenko";
		Date date1 = new Date();
		Profile profile1 = new Profile();
		

		Ride ride1 = rideList.createRide(start1, finish1, date1, profile1);
		
		String start2 = "Grishko";
		String finish2 = "Grigorenko";
		Date date2 = new Date();
		Profile profile2 = new Profile();
		
		Ride ride2 = rideList.createRide(start2, finish2, date2, profile2);
		
		String start3 = "Cristal";
		String finish3 = "Odessa";
		Date date3 = new Date();
		Profile profile3 = new Profile();
		
		Ride ride3 = rideList.createRide(start3, finish3, date3, profile3);
		
		List<Ride> rides = new ArrayList<Ride>();
		rides.add(ride3);
		
		Map<String, String> fields = new HashMap<String, String>();
		fields.put("start", "Cristal");
		fields.put("finish", "Odessa");
		
		
		Assert.assertEquals(rides, rideList.search(fields));
	}

}

package com.intropro.blablacar;

import static org.junit.Assert.*;

import java.util.Date;

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

}

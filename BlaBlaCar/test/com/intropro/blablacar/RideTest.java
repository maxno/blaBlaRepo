package com.intropro.blablacar;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class RideTest {

	@Test
	public void testCreateRide() {

		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile owner = new Profile();

		Ride ride = Ride.createRide(start, finish, date, owner);

		assertNotNull(ride);
	}

	@Test
	public void testViewRide() {

		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile owner = new Profile();

		Ride ride = Ride.createRide(start, finish, date, owner);

		Map rideParametersMap = new HashMap<String, String>();

		rideParametersMap.put("start", start);
		rideParametersMap.put("finish", finish);
		rideParametersMap.put("date", date.toString());
		rideParametersMap.put("owner", owner.toString());

		Assert.assertEquals(rideParametersMap, ride.viewRide(ride));

	}

	@Test
	public void testUpdateRideParams() {

		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile owner = new Profile();

		String updatedStart = "Mishugi";
		String updatedFinish = "Odessa";

		HashMap rideParametersMap = new HashMap<String, String>();

		rideParametersMap.put("start", updatedStart);
		rideParametersMap.put("finish", updatedFinish);
		rideParametersMap.put("date", date.toString());
		rideParametersMap.put("owner", owner.toString());

		Ride ride = Ride.createRide(start, finish, date, owner);

		Assert.assertEquals(rideParametersMap, ride.updateRideParams(ride, rideParametersMap));
	}
}

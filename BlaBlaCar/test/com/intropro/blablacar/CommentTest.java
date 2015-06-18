package com.intropro.blablacar;

import static org.junit.Assert.*;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CommentTest {

	
	@Test
	public void createCommentTest() {
		
		Profile commentOwner = new Profile();
		String body = "Hello, World!!!";
		
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile rideOwner = new Profile();
		Ride ride = Ride.createRide(start, finish, date, rideOwner);
		
		Comment comment = new Comment(ride, commentOwner, body);
		
		Assert.assertEquals(ride.getComments().get(0), comment);
		
	}

}

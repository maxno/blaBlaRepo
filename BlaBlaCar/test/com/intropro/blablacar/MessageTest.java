package com.intropro.blablacar;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageTest {

	
	@Test
	public void sendMessageTest() {
		
		Profile to = new Profile();
		Profile from = new Profile();
		String body = "Hello, World!!!";
		
		Message message = new Message(to, from, body);
				
		Assert.assertEquals(message, to.getMessages().get(0));
	}
	
	@Test
	public void notifyRecivierTst(){
		
		Profile to = new Profile();
		Profile from = new Profile();
		String body = "Hello, World!!!";
		
		Message message = new Message(to, from, body);
		Message message2 = new Message(to, from, body);
		Assert.assertEquals(2, to.getMessageCounter());
	}
	
	

}

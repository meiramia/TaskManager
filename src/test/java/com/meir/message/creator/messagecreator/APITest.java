package com.meir.message.creator.messagecreator;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonParser;
import com.meir.message.creator.messagecreator.bo.AcknoledgmentResponse;
import com.meir.message.creator.messagecreator.service.JobServices;
import com.meir.message.creator.messagecreator.service.business.Message;

public class APITest 
{
	Message [] messagesFormJson;
	JobServices jobService;
	@Before
	public void readInput()
	{
		jobService = new JobServices();
		readMesages();
	}
	
	private void readMesages() 
	{
	 messagesFormJson = new Message[3];
	 messagesFormJson[0] = new Message();
	 messagesFormJson[1] = new Message();
	 messagesFormJson[2] = new Message();
	 
	 
	 
	 messagesFormJson[0].setDescription("1");
	 messagesFormJson[0].setMessage("Message 1");
	 messagesFormJson[0].setMessageId("1");
	 messagesFormJson[0].setPriority("1");
	 
	 messagesFormJson[1].setDescription("2");
	 messagesFormJson[1].setMessage("Message 2");
	 messagesFormJson[1].setMessageId("2");
	 messagesFormJson[1].setPriority("2");
	 
	 messagesFormJson[2].setDescription("3");
	 messagesFormJson[2].setMessage("Message 3");
	 messagesFormJson[2].setMessageId("3");
	 messagesFormJson[2].setPriority("not number");
	}

	@Test
	public void testPOSTApiNullMesage()
	{
		AcknoledgmentResponse ack = jobService.addJob("3", null);
		assertEquals(false,ack.isSuccess());
	}
	@Test
	public void testPOSTApiMesage1()
	{
		
		AcknoledgmentResponse ack = jobService.addJob("3", messagesFormJson[0]);
		assertEquals(true,ack.isSuccess());
	}
	
	@Test
	public void testPOSTApiMesage2()
	{
		AcknoledgmentResponse ack = jobService.addJob("3", messagesFormJson[1]);
		assertEquals(true,ack.isSuccess());
	}
	
	@Test
	public void testPOSTApiMesage3()
	{
		AcknoledgmentResponse ack = jobService.addJob("3", messagesFormJson[2]);
		assertEquals(false,ack.isSuccess());
	}
}


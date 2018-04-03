package com.meir.message.creator.messagecreator.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meir.message.creator.messagecreator.bo.AcknoledgmentResponse;
import com.meir.message.creator.messagecreator.service.business.Message;

/**
 * Created by meiramia on 1/4/2018
 */

@RestController
public class JobServices {

	@RequestMapping(value = "/addJob", method = RequestMethod.POST ,consumes = "application/json" ,produces="application/json")
	public AcknoledgmentResponse addJob(@RequestParam String input, @RequestBody Message msg) 
	{
		AcknoledgmentResponse ack = new AcknoledgmentResponse();

		if (!isInputValid(msg))
		{
			ack.setDescription("Failure in Input validation");
			return ack;
		}
		System.out.println(" **********  Request for new JOB *********   " + input + "\n"
				+ "Json Obj" + msg.toString());
		ack.setSuccess(true);
		ack.setDescription("Sucess");
		return ack;
	}

	private boolean isInputValid(Message msg) 
	{
		if (msg == null)
		{
			return false;
		}
		try {
			Integer.valueOf(msg.getPriority());
			}	
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}
}
package com.borntocode.service;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {
	
	

	public void sendMessage(String message, String receiver) {
		System.out.println("Sending SMS message !!");
		System.out.println("SMS sent to :" + receiver);
		System.out.println("Message " + message);

	}

}

package com.borntocode.service;

public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("Sending SMS message !!");
		System.out.println("SMS sent to :" + receiver);
		System.out.println("Message " + message);

	}

}

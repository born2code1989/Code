package com.borntocode.service;

public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("Sending Email message !!");
		System.out.println("Email sent to :" + receiver);
		System.out.println("Message " + message);
	}

}

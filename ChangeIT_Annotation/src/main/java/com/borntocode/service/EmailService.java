package com.borntocode.service;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailService implements MessageService {

	public void sendMessage(String message, String receiver) {
		System.out.println("Sending Email message !!");
		System.out.println("Email sent to :" + receiver);
		System.out.println("Message " + message);
	}

}

package com.borntocode.service;

public class EmailService {

	public void sendMail(String message, String receiver) {
		System.out.println("Mail is sent to :" + receiver + " with message :" + message);
	}
}

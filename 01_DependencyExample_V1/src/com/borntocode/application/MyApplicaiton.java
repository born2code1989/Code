package com.borntocode.application;

import com.borntocode.service.EmailService;

public class MyApplicaiton {
	private EmailService emailService;

	public MyApplicaiton() {
		// TODO Auto-generated constructor stub
	}

	public MyApplicaiton(EmailService emailService) {
		this.emailService = emailService;
	}

	public void ProcessMessage(String message, String receiver) {
		this.emailService.sendMail(message, receiver);
	}
}

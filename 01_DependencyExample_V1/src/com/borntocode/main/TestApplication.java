package com.borntocode.main;

import com.borntocode.application.MyApplicaiton;
import com.borntocode.service.EmailService;

public class TestApplication {
	public static void main(String[] args) {
		EmailService service = new EmailService();

		MyApplicaiton applicaiton = new MyApplicaiton(service);
		applicaiton.ProcessMessage("Hello !!", "Vivek Gohil");
	}
}

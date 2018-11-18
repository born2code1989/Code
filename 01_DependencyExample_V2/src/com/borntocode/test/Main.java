package com.borntocode.test;

import java.util.Scanner;

import com.borntocode.consumer.MyApplication;
import com.borntocode.service.EmailService;
import com.borntocode.service.MessageService;
import com.borntocode.service.SMSService;

public class Main {
	public static void main(String[] args) {

		MessageService service = null;

		System.out.println("1.. SMS Service");
		System.out.println("2.. Email service");

		int choice = new Scanner(System.in).nextInt();

		switch (choice) {
		case 1:
			service = new SMSService();
			break;
		case 2:
			service = new EmailService();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

		MyApplication application = new MyApplication(service);
		application.processMessage("Hello !!", "Vivek Gohil");

	}
}

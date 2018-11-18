package com.borntocode.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.borntocode.consumer.MyApplication;
import com.borntocode.service.EmailService;
import com.borntocode.service.MessageService;
import com.borntocode.service.SMSService;

public class Main {
	public static void main(String[] args) {

		// create and configure beans
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyApplication application = null;
		System.out.println("1.. SMS Service");
		System.out.println("2.. Email service");

		int choice = 2;
		switch (choice) {
		case 1:
			application = (MyApplication) context.getBean("smsApplication");
			break;
		case 2:
			application = (MyApplication) context.getBean("emailApplication");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

		application.processMessage("Hello !!", "Vivek Gohil");

	}
}

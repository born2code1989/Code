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
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyApplication application = context.getBean("myApp", MyApplication.class);

		application.processMessage("Hello !!", "Vivek Gohil");

		context.close();
	}
}

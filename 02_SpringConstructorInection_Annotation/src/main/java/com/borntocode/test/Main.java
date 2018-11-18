package com.borntocode.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.borntocode.consumer.MyApplication;

public class Main {
	public static void main(String[] args) {

		// create and configure beans
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyApplication application = context.getBean("myApplication", MyApplication.class);

		application.processMessage("Hello !!", "Vivek Gohil");

	}
}

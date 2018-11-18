package com.borntocode.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.borntocode.pojo.Message;

public class InjectionTest {
	public static void main(String[] args) {
		System.out.println("Welcome to Spring");
		
		System.out.println("We are starting injection");
		
		// create and configure beans
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// retrieve configured instance
		Message message = context.getBean("msg", Message.class);

		System.out.println(message);
		
	}
}

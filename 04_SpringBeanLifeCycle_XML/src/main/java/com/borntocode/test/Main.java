package com.borntocode.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.borntocode.consumer.MyApplication;

public class Main {
	public static void main(String[] args) {

		// create and configure beans

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyApplication application = null;

		System.out.println("----------------------------------------");
		System.out.println("Calling getBean(myApplication)");
		application = (MyApplication) context.getBean("myApplication");
		System.out.println("Object created by spring factory/container");
		System.out.println("HashCode = " + application.hashCode());
		
		System.out.println("----------------------------------------");
		System.out.println("Calling getBean(myApplication)");
		application = (MyApplication) context.getBean("myApplication");
		System.out.println("Object created by spring factory/container");
		System.out.println("HashCode = " + application.hashCode());
		
	}
}

package com.borntocode.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.borntocode.service.MessageService;

@Component("myApp")
public class MyApplication {

	@Qualifier("email")
	private MessageService service;

	public MyApplication() {
		System.out.println("In default construtor of MyApplication");
	}

	@Autowired
	public MyApplication(MessageService service) {
		this.service = service;
		System.out.println("In Parm. constructor of MyApplication");
	}

	public void processMessage(String message, String receiver) {
		service.sendMessage(message, receiver);
		System.out.println("In processMessage");
	}
}

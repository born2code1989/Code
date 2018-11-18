package com.borntocode.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.borntocode.service.MessageService;

@Component
public class MyApplication {

	private MessageService service;

	public MyApplication() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public MyApplication(@Qualifier("email") MessageService service) {
		System.out.println("In Param. Constructor of MyApplication");
		this.service = service;
	}

	public void processMessage(String message, String receiver) {
		service.sendMessage(message, receiver);
	}
}

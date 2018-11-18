package com.borntocode.consumer;

import com.borntocode.service.MessageService;

public class MyApplication {

	private MessageService service;

	public MyApplication() {
		System.out.println("Default constructor of MyApplication");
		// TODO Auto-generated constructor stub
	}

	public MyApplication(MessageService service) {
		this.service = service;
		System.out.println("In Param constructor of MyApplication");
	}

	public void processMessage(String message, String receiver) {
		service.sendMessage(message, receiver);
	}
}

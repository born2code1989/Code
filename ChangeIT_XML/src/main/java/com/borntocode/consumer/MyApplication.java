package com.borntocode.consumer;

import com.borntocode.service.MessageService;

public class MyApplication {

	private MessageService service;

	public MyApplication() {
		// TODO Auto-generated constructor stub
	}

	public MyApplication(MessageService service) {
		this.service = service;
	}

	public void processMessage(String message, String receiver) {
		service.sendMessage(message, receiver);
	}
}

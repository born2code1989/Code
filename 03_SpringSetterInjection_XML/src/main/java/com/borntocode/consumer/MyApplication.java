package com.borntocode.consumer;

import com.borntocode.service.MessageService;

public class MyApplication {

	private String message;
	private String receiver;
	private MessageService service;

	public MyApplication() {
		System.out.println("In default constructor");
	}
	

	public MyApplication(MessageService service) {
		System.out.println("in param constructor");
		this.service = service;
	}

	public void setService(MessageService service) {
		System.out.println("In setService method !!");
		this.service = service;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Setting message");
		this.message = message;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		System.out.println("Setting receiver");
		this.receiver = receiver;
	}

	public void processMessage(String message, String receiver) {
		System.out.println("In process message");
		service.sendMessage(message, receiver);
	}
}

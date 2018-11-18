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

	public MyApplication(MessageService service) {
		System.out.println("In Constructor of MyApplication");
		this.service = service;
	}

	public MessageService getService() {
		return service;
	}

	@Autowired
	public void setService(@Qualifier("SMSService") MessageService service) {
		this.service = service;
	}

	public void processMessage(String message, String receiver) {
		service.sendMessage(message, receiver);
	}
}

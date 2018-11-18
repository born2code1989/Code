package com.borntocode.endpoint;

import javax.xml.ws.Endpoint;

import com.borntocode.ws.HelloWorldImpl;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		System.out.println("Publishing started..");
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
		System.out.println("Publishing ended..");
	}
}

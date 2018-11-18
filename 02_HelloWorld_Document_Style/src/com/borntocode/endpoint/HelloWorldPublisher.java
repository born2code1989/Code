package com.borntocode.endpoint;

import javax.xml.ws.Endpoint;

import com.borntocode.ws.HelloWorldImpl;

public class HelloWorldPublisher {
	public static void main(String[] args) {
		try {
			System.out.println("Start...");
			Endpoint.publish("http://localhost:9999/ws/hello",
					new HelloWorldImpl());
			System.out.println("Stop...");
		} catch (Exception e) {
			System.out.println("Exception ");
			System.out.println(e.getMessage());
		}

	}
}

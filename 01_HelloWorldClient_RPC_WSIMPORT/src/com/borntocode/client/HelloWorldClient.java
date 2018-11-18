package com.borntocode.client;

import com.borntocode.ws.HelloWorld;
import com.borntocode.ws.HelloWorldImplService;

public class HelloWorldClient {

	public static void main(String[] args) {
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();

		System.out.println(hello.getHelloWorldAsString("Vivek"));
	}

}

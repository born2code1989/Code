package com.borntocode.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.borntocode.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String getHelloWorldAsString(String name) {
		// TODO Auto-generated method stub
		return "Hello World JAX-WS " + name;
	}
}

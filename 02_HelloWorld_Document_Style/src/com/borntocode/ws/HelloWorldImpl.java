package com.borntocode.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.borntocode.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS :: Documeent style " + name;
	}
}

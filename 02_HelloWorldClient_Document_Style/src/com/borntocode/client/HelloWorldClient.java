package com.borntocode.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.borntocode.ws.HelloWorld;

public class HelloWorldClient {
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://localhost:9999/ws/hello?wsdl");

			QName qname = new QName("http://ws.borntocode.com/",
					"HelloWorldImplService");

			Service service = Service.create(url, qname);

			HelloWorld hello = service.getPort(HelloWorld.class);

			System.out.println(hello.getHelloWorldAsString("Vivek"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

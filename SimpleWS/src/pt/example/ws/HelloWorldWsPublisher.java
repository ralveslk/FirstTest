package pt.example.ws;

import javax.xml.ws.Endpoint;

public class HelloWorldWsPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/HelloWorld", new HelloWorldImpl());
	}
}

package pt.example.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {

	@WebMethod
	String hello(final String name);
}

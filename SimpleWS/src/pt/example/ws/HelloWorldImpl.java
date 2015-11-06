package pt.example.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pt.example.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	private static final String HELLO = "Hello ";

	@Override
	public String hello(String name) {
		return HELLO + upperFirstLetter(name);
	}

	private String upperFirstLetter(String txt) {
		if (txt == null || txt.isEmpty()) {
			return "John Smith ;)";
		}
		char c = txt.charAt(0);
		char bigC = Character.toUpperCase(txt.charAt(0));
		if (c == bigC) {
			return txt;
		} else {
			return bigC + txt.substring(1);
		}
	}
}

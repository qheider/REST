package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/xml/user")
public class XMLService {

	@GET
	@Path("/get")
	@Produces("application/xml")
	public User getUserInXML() {

		User user = new User();
		user.setUsername("mkyong");
		user.setPassword("password");
		user.setPin(generatePin());
		
		return user; 

	}

	private String generatePin() {
		String pin =    getRandomTriple() + "-" +
                getRandomTriple() + "-" +
                getRandomTriple() + "-" +
                getRandomTriple();
//System.out.println("Generated " + pin);
return pin;
} 
public static int getRandomDigit() {
return (int)(10.0 * Math.random());
} 
public static char getRandomChar() {
return (char)('A' + (26.0 * Math.random()) );
}

public static String getRandomTriple() {
return "" + getRandomDigit() + getRandomDigit() + getRandomChar();
} 

	

}
package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RestController;

@Path("/UserService")
public class UserServices {

	@GET
	@Path("/usersAdd")
	@Produces("application/xml")
	public double getAddition(@PathParam("a")double a,@PathParam("b") double b){
		return a + b;
	}
	
	@GET
	@Path("/usersSub")
	@Produces("application/json")
	public double getSubtraction(@PathParam("a")double a, @PathParam("b")double b){
		return a - b;
	}
	
	@GET
	@Path("/usersDetails")
	@Produces("application/json")
	public String getUserData(){
		return "Manas Kumar Maharana";
	}

}

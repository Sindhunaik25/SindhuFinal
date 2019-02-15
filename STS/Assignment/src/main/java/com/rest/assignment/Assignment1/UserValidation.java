package com.rest.assignment.Assignment1;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/validate")
public class UserValidation {

	@POST

	@Produces(MediaType.TEXT_PLAIN)

	public String validateUser(@FormParam("username") String username, @FormParam("password") String password) {

		if (username.equals("Sindhu") && password.equals("naik")) {
			return "valid";
		}
		return "not valid";

	}
}

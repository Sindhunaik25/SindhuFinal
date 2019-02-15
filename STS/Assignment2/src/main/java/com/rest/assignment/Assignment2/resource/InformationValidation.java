package com.rest.assignment.Assignment2.resource;

import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.assignment.Assignment2.model.Information;
import com.rest.assignment.Assignment2.service.InfoDAO;

@Path("info")
public class InformationValidation {
	InfoDAO dao = new InfoDAO();

	@Path("{zip}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Information getInfo(@PathParam("zip") int zip1) {
		for (Map.Entry<Integer, Information> entry : dao.getAllInformation().entrySet()) {
			if (zip1 == entry.getKey()) {
				Information information = entry.getValue();
				return information;

			}
		}
		return null;

	}
}

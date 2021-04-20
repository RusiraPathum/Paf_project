package com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Produts")
public class Product {

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String readPosts() {
		return "fffffff";

	}
}

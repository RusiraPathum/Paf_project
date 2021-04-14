package com.product.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.product.model.ProductServlet;

@Path("/Product")
public class ProductService {

	ProductServlet prdct = new ProductServlet();
	
	@GET
	@Path("/")
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String readProjects() {
		return prdct.readProduct();
	}
	
}

package com.model;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.model.Product;
import com.service.ProductService;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;



@Path("/Produts")
public class Product {
	ProductService product = new ProductService();

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String readProducts() {
		return product.readProducts();

	}
	
	@POST
	@Path("/")
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String insertProdect(
				@FormParam("prodect_name") String product_Name,
				@FormParam("prodect_category") String product_category,
				@FormParam("date") String date,
				@FormParam("price") String price,
				@FormParam("description") String description) {
		
		String output =  product.insertProduct(product_Name, product_category, date, price, description);
		return output;
	}

	
	@DELETE
	@Path("/") 
	@Consumes(MediaType.APPLICATION_XML) 
	@Produces(MediaType.TEXT_PLAIN) 
	public String deleteProduct(String productData) 
	{ 
	//Convert the input string to an XML document
	 Document doc = Jsoup.parse(productData, "", Parser.xmlParser()); 
	 
	//Read the value from the element <itemID>
	 String product_Id = doc.select("product_Id").text(); 
	 String output = product.deleteProduct(product_Id); 
	return output; 
	}
}
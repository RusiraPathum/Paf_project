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
	public String insertProject(
				@FormParam("project_name") String productName,
				@FormParam("project_category") String product_category,
				@FormParam("date") String date) {
		
		String output =  product.insertProduct(productName, product_category, date);
		return output;
	}
//	
//	@PUT
//	@Path("/")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public String updateProduct(String productData) {
//		//Convert the input string to a JSON object
//		
//		JsonObject productObject = new JsonParser().parse(productData).getAsJsonObject();
//		 
//		//Read the values from the JSON object
//		
//		 String productID = productData.get("productId").getAsString(); 
//		 String productName = productData.get("project_name").getAsString();
//		 String productCat = productData.get("project_category").getAsString();
//		 String productDate = productData.get("date").getAsString();
//		 String output = product.updateProduct(productID, productName, productCat, productDate);
//		return output;
//		 
//	}
	
	@DELETE
	@Path("/") 
	@Consumes(MediaType.APPLICATION_XML) 
	@Produces(MediaType.TEXT_PLAIN) 
	public String deleteItem(String itemData) 
	{ 
	//Convert the input string to an XML document
	 Document doc = Jsoup.parse(itemData, "", Parser.xmlParser()); 
	 
	//Read the value from the element <itemID>
	 String productId = doc.select("productId").text(); 
	 String output = product.deleteItem(productId); 
	return output; 
	}
}
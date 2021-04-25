package com.paf.customer.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.paf.customer.bean.Customer;
import com.paf.customer.model.CustomerDAO;

@Path("/customer")
public class CustomerService {

	@POST
	@Path("/customer_registration")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	public String registerCustomer(@FormParam("nic") String nic, @FormParam("firstName") String firstName,
			@FormParam("lastName") String lastName, @FormParam("dob") String dob, @FormParam("gender") String gender,
			@FormParam("email") String email, @FormParam("password") String password) {

		String status = null;

		Customer c = new Customer(nic, firstName, lastName, dob, gender, email, password);

		status = CustomerDAO.registerCustomer(c);

		return "<h2>" + status + "</h2><br><br>";
	}

//	@POST
//	@Path("/customer_registration2")
//	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//	@Produces(MediaType.TEXT_HTML)
//	public String registerCustomer2(@FormParam("nic") String nic, @FormParam("firstName") String firstName,
//			@FormParam("lastName") String lastName, @FormParam("dob") String dob, @FormParam("gender") String gender,
//			@FormParam("email") String email, @FormParam("password") String password) {
//
//		String status = null;
//
//		String NIC = "/" + nic + "\"";
//
//		Customer p = new Customer(nic, firstName, lastName, dob, gender, email, password);
//
//		status = CustomerDAO.registerCustomer(p);
//
//		return "<h2>" + status + "</h2><br><br>";
//	}

	@POST
	@Path("/customer_login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String loginCustomer(@FormParam("email") String email, @FormParam("password") String password) {

		String status = "Invalid user";

		Customer p = new Customer(email, password);

		status = CustomerDAO.CustomerLogin(p);

		return status;
	}

	@PUT
	@Path("/customer_update")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateCustomer(@FormParam("nic") String nic, @FormParam("firstName") String firstName,
			@FormParam("lastName") String lastName, @FormParam("dob") String dob, @FormParam("gender") String gender,
			@FormParam("email") String email, @FormParam("password") String password) {

		Customer p = new Customer(nic, firstName, lastName, dob, gender, email, password);

		String output = CustomerDAO.updateCustomer(p);

		return output;
	}

	@GET
	@Path("/customer_list")
	@Produces(MediaType.TEXT_HTML)
	public String getCustomerList() {

		return CustomerDAO.CustomerList();

	}

	@DELETE
	@Path("/delete_customer")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteCustomer(@FormParam("nic") String nic) {

		Customer p = new Customer();

		p.setNic(nic);

		String output = CustomerDAO.deleteCustomer(p);

		return output;
	}

}

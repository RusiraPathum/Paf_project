package com.project.service;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.project.model.ProjectServlet;


@Path("/Projects")
public class ProjectService {
	
	ProjectServlet projectObj = new ProjectServlet();
	
	@GET
	@Path("/")
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String readProjects() {
		return projectObj.readProjects();
	}

}

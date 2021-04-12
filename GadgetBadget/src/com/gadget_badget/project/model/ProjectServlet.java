package com.gadget_badget.project.model;

import java.sql.*;

public class ProjectServlet {
	
	public static void main(String[] args) {
	
		// A common method to connect to the DB
				
					Connection con = null;
					try {
						Class.forName("com.mysql.jdbc.Driver");

						// Provide the correct details: DBServer/DBName, username, password
						con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gadgetbadget", "root",
								"");
						System.out.println("successfull");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		
	}



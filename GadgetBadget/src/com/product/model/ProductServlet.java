package com.product.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductServlet {

	private static Connection connect() {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3333/gadgetbadget", "root", "");
			
			System.out.println("succsess");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	//read 
			public static String readProduct() {
				String output = "";

				try {
					Connection con = connect();
					if (con == null) {
						return "Error while connecting to the database for reading.";
					}
					// Prepare the html table to be displayed
					
					output = "<div class='container'><table border='1' style='text-align:center'><tr>"
							+ "<th style='padding:10px; text-align:center;'>Project ID</th>"
							+ "<th style='padding:10px; text-align:center;'>Project Category</th>"
							+ "<th style='padding:10px; text-align:center;'>Project Name</th>"
							+ "<th style='padding:10px; text-align:center;'>Project Short Description</th>"
							+ "<th style='padding:10px; text-align:center;'>Project Price</th>"
							+ "<th style='padding:10px; text-align:center;'>Project date</th>"
							+ "<th style='padding:10px; text-align:center;'>Project Goal</th>"
							+ "<th style='padding:10px; text-align:center;'>Project Loang Description</th>"
							+ "<th style='padding:10px; text-align:center;'>Update</th><th>Remove</th></tr>";

					String query = "SELECT * FROM product";
//					System.out.println(query);
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					// iterate through the rows in the result set
					while (rs.next()) {
						String productId = Integer.toString(rs.getInt("productId"));
						String productName = rs.getString("productName");
						
//						System.out.println(projectID);
//						System.out.println(projectName);

						// Add into the html table
						output += "<tr><td style='padding:10px; text-align:center;'>" + productId + "</td>";
						output += "<td style='padding:10px; text-align:center;'>" + productName + "</td>";

						// buttons
						output += "<td style='padding:10px; text-align:center;'><input name='btnUpdate' type='button' value='Update' class='btn btn-info'></td>"
								+ "<td style='padding:10px; text-align:center;'><form method='post' action='items.jsp'>"
								+ "<input style='margin-top:15px' name='btnRemove' type='submit' value='Remove' class='btn btn-danger'>"
								+ "<input name='itemID' type='hidden' value='" + productId + "'>" + "</form></td></tr>";
					}
					con.close();
					// Complete the html table
					output += "</table></div>";
				} catch (Exception e) {
					output = "Error while reading the project details...!";
					System.err.println(e.getMessage());
				}
				return output;
			}
}

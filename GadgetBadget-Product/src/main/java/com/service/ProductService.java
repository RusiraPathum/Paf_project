


package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductService {

	private Connection connect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Provide the correct details: DBServer/DBName, username, password
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3333/gadgetbadget", "root", "");
			System.out.println("Connection successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public String insertProduct(String name, String cat, String date, String price, String desc) {
		String output = "";
		try {
			Connection con = connect();
			if (con == null) {
				return "Error while connecting to the database for inserting.";
			}
			// create a prepared statement
			String query = " insert into product(`product_Name`,`product_category`,`date`,`price`,`description`)" + " values (?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			// binding values
			preparedStmt.setString(1, name);
			preparedStmt.setString(2, cat);
			preparedStmt.setString(3, date);
			preparedStmt.setString(4, price);
			preparedStmt.setString(5, desc);
			// execute the statement
			preparedStmt.execute();
			con.close();
			output = "Inserted successfully";
		} catch (Exception e) {
			output = "Error while inserting the item.";
			System.err.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		return output;
	}

	public String readProducts() {
		String output = "";
		try {
			Connection con = connect();
			if (con == null) {
				return "Error while connecting to the database for reading.";
			}
			// Prepare the html table to be displayed
			output = "<table border='1'><tr><th>Product ID</th><th>Product Name</th>" + "<th>Product Category</th>"
					+ "<th>Product Date</th><th>Product Price</th><th>Product Description</th>";

			String query = "select * from product";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			// iterate through the rows in the result set
			while (rs.next()) {
				String product_ID = Integer.toString(rs.getInt("product_Id"));
				String product_Name = rs.getString("product_Name");
				String product_Category = rs.getString("product_category");
				String date = rs.getString("date");
				String price = rs.getString("price");
				String description = rs.getString("description");
				output += "<tr><td>" + product_ID + "</td>";
				output += "<td>" + product_Name + "</td>";
				output += "<td>" + product_Category + "</td>";
				output += "<td>" + date + "</td>";
				output += "<td>" + price + "</td>";
				output += "<td>" + description + "</td>";
				// buttons
				output += "<td><input name='btnUpdate' type='button' value='Update'class='btn btn-secondary'></td>"
						+ "<td><form method='post' action='items.jsp'>"
						+ "<input name='btnRemove' type='submit' value='Remove'class='btn btn-danger'>"
						+ "<input name='productID' type='hidden' value='" + product_ID + "'>" + "</form></td></tr>";

			}
			con.close();
			// Complete the html table
			output += "</table>";
//			System.out.println("cc");

		} catch (Exception e) {
			output = "Error while reading the Product.";
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		return output;

	}

	public String updateProduct(String ID, String Name, String cat, String date, String price, String desc) {
		String output = "";
		try {
			Connection con = connect();
			if (con == null) {
				return "Error while connecting to the database for updating.";
			}
			// create a prepared statement
			String query = "UPDATE product SET product_Name=?,product_category=?,date=?,price=?,description=? WHERE product_Id=?";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			// binding values
			preparedStmt.setString(1, Name);
			preparedStmt.setString(2, cat);
			preparedStmt.setString(3, date);
			preparedStmt.setString(4, price);
			preparedStmt.setString(5, desc);
			preparedStmt.setString(6, ID);
			// execute the statement
			preparedStmt.execute();
			con.close();
			output = "Updated successfully";
		} catch (Exception e) {
			output = "Error while updating the Product.";
			System.err.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		return output;
	}
	
	public String deleteProduct(String productId) {
		String output = "";
		try {
			Connection con = connect();
			if (con == null) {
				return "Error while connecting to the database for deleting.";
			}
			// create a prepared statement
			String query = "delete from product where product_Id=?";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			// binding values
			preparedStmt.setInt(1, Integer.parseInt(productId));
			// execute the statement
			preparedStmt.execute();
			con.close();
			output = "Deleted successfully";
		} catch (Exception e) {
			output = "Error while deleting the Product.";
			System.err.println(e.getMessage());
		}
		return output;
	}
}


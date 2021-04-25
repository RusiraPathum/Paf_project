package com.paf.customer.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.paf.customer.bean.Customer;

public class CustomerDAO {
	
public static Connection getConnection( ) {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paf", "root", "");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static String registerCustomer(Customer c) {
		
		String output = null;
		
		try {
			Connection con = getConnection();
			
			String query = "insert into customer values(?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, c.getNic());
			ps.setString(2, c.getFirstName());
			ps.setString(3, c.getLastName());
			ps.setString(4, c.getDob());
			ps.setString(5, c.getGender());
			ps.setString(6, c.getEmail());
			ps.setString(7, c.getPassword());
			
			ps.executeUpdate();
			
			output = "Customer Register Successfully";
			
		} catch (Exception e) {
			e.printStackTrace();
			
			output = "Error in registration process";
		}
		
		return output;
		
	}
	
	public static String CustomerLogin(Customer c) {
		
		String status = "Invalid";
		
		try {
			Connection con = getConnection();
			
			String query = "select Passwords from customer where email = ?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, c.getEmail());
			
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			//ResultSet rs = ps.execute(query);
			
			while(rs.next()) {
				System.out.println("ddd");
				 if (c.getPassword() == rs.getString("Passwords") ) {
					 status = "valid user";
				 }
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public static String updateCustomer(Customer c) {
		String status = null;
		
		try {
			Connection con = getConnection();
			
			String queary = "update customer set firstName=?, lastName=?, dob=?, gender=?,"
					+ "email=?, Passwords=? where nic=?";
			
			PreparedStatement ps = con.prepareStatement(queary);
			
			ps.setString(1, c.getFirstName());
			ps.setString(2, c.getLastName());
			ps.setString(3, c.getDob());
			ps.setString(4, c.getGender());
			ps.setString(5, c.getEmail());
			ps.setString(6, c.getPassword());
			ps.setString(7, c.getNic());
			
			ps.executeUpdate();
			
			status = "Customer Update Successfully";
		} catch (Exception e) {
			e.printStackTrace();
			status = "Error in update process";
		}
		
		return status;
	}
	
	public static String deleteCustomer(Customer c) {
		String status = null;
		
		try {
			Connection con = getConnection();
			
			String query = "delete from customer where nic=?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, c.getNic());
			
			ps.execute();
			
			status = "Customer deleted successfuly";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			status = "Error in deleting process.";
		}
		
		return status;
		
	}
	
	public static String CustomerList() {
		
		String output = "";
		
		try {
			Connection con = getConnection();
			
			output += "<head>\r\n" + 
					"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\r\n" + 
					"integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\r\n" + 
					"</head>" + 
					"<body>" +
					"<table border=\"1\"><tr><th>NIC</th>" + "<th>First Name</th><th>Last Name</th>" + "<th>Date of Birth</th>" +
					"<th>Gender</th>" + "<th>Email</th>" + "<th>Password</th>" + 
					"</body>";
			
			String query = "select * from customer";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
				String nic = rs.getString("nic");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String dob = rs.getString("dob");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String password = rs.getString("Passwords");
				
				output += "<tr><td>" + nic + "</td>";
				output += "<td>" + firstName + "</td>";
				output += "<td>" + lastName + "</td>";
				output += "<td>" + dob + "</td>";
				output += "<td>" + gender + "</td>";
				output += "<td>" + email + "</td>";
				output += "<td>" + password + "</td>";
				
				output += "</tr>";
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		output += "</table></body>";
		
		return output;
	}

}

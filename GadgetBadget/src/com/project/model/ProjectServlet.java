package com.project.model;

import java.sql.*;

public class ProjectServlet {
	
		private static Connection connect() {
			
			Connection con = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gadgetbadget", "root", "");
				
				System.out.println("Connection succsessfull");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
			
		}
		
		//insert
		public String insertProject (String project_category, String project_name, String short_des, String price, String date, String project_goal, String long_des) {
			
			String output = "";
			
			try {
				
				Connection con = connect();
				if (con == null) {
					return "Error Inserting";
				}
				
				String query = "INSERT INTO project (project_category, project_name, short_des, price, date, project_goal, long_des) VALUES (?, ?, ?, ?, ?, ?, ?)";
				
			
				
				PreparedStatement ps = con.prepareStatement(query);
				
//				ps.setInt(1, 0);;
				ps.setString(1, project_category);
				ps.setString(2, project_name);
				ps.setString(3, short_des);
				ps. setString(4, price);
				ps.setString(5, date);
				ps.setString(6, project_goal);
				ps.setString(7, long_des);
				
				ps.execute();
				con.close();
				output = "Project Details have been Inserted Successfully !";
				
			} catch (Exception e) {
				output = "Project Details Inserted Failed";
				System.out.println(e.getMessage());
				System.out.println(e);
				e.printStackTrace();
			}
			
			return output;
		}
		
		//read 
		public static String readProjects() {
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

				String query = "SELECT * FROM project";
//				System.out.println(query);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				// iterate through the rows in the result set
				while (rs.next()) {
					String projectID = Integer.toString(rs.getInt("pid"));
					String projectCategory = rs.getString("project_category");
					String projectName = rs.getString("project_name");
					String projectShoDesc = rs.getString("short_des");
					String projectPrice = rs.getString("price");
					String projectDate = rs.getString("date");
					String projectGoal = rs.getString("project_goal");
					String projectLongDes = rs.getString("long_des");
					
//					System.out.println(projectID);
//					System.out.println(projectName);

					// Add into the html table
					output += "<tr><td style='padding:10px; text-align:center;'>" + projectID + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectCategory + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectName + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectShoDesc + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectPrice + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectDate + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectGoal + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectLongDes + "</td>";

					// buttons
					output += "<td style='padding:10px; text-align:center;'><input name='btnUpdate' type='button' value='Update' class='btn btn-info'></td>"
							+ "<td style='padding:10px; text-align:center;'><form method='post' action='items.jsp'>"
							+ "<input style='margin-top:15px' name='btnRemove' type='submit' value='Remove' class='btn btn-danger'>"
							+ "<input name='itemID' type='hidden' value='" + projectID + "'>" + "</form></td></tr>";
				}
				con.close();
				// Complete the html table
				output += "</table></div>";
			} catch (Exception e) {
				output = "Error while reading the project details...!";
				System.out.println(e.getMessage());
				System.out.println(e);
				e.printStackTrace();
			}
			return output;
		}
		
		//read project details only
		public  String readeProjectDetailsOnly() {
			
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

				String query = "SELECT * FROM project";
//				System.out.println(query);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				// iterate through the rows in the result set
				while (rs.next()) {
					String projectID = Integer.toString(rs.getInt("pid"));
					String projectCategory = rs.getString("project_category");
					String projectName = rs.getString("project_name");
					String projectShoDesc = rs.getString("short_des");
					String projectPrice = rs.getString("price");
					String projectDate = rs.getString("date");
					String projectGoal = rs.getString("project_goal");
					String projectLongDes = rs.getString("long_des");
					
//					System.out.println(projectID);
//					System.out.println(projectName);

					// Add into the html table
					output += "<tr><td style='padding:10px; text-align:center;'>" + projectID + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectCategory + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectName + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectShoDesc + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectPrice + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectDate + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectGoal + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectLongDes + "</td>";

					// buttons
//					output += "<td style='padding:10px; text-align:center;'><input name='btnUpdate' type='button' value='Update' class='btn btn-info'></td>"
//							+ "<td style='padding:10px; text-align:center;'><form method='post' action='items.jsp'>"
//							+ "<input style='margin-top:15px' name='btnRemove' type='submit' value='Remove' class='btn btn-danger'>"
//							+ "<input name='itemID' type='hidden' value='" + projectID + "'>" + "</form></td></tr>";
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
	
		//update
		public String updateProject(String pid, String project_category, String project_name, 
				String short_des, String price, String date, String project_goal, String long_des) {
			
			String output = "";
			
			try {
				
				Connection con = connect();
				if (con == null) {
					return "Error while connecting to the database for updating.";
				}
				
				String query = "UPDATE project SET project_category=?, project_name=?, short_des=?, price=?, date=?, project_goal=?, long_des=? where pid=?";
				PreparedStatement ps = con.prepareStatement(query);
				
				ps.setString(1, project_category);
				ps.setString(2, project_name);
				ps.setString(3, short_des);
				ps.setString(4, price);
				ps.setString(5, date);
				ps.setString(6, project_goal);
				ps.setString(7, long_des);
				ps.setString(8, pid);
				
				ps.execute();
				con.close();
				output = "Project details have been updated successfully...!";
				
			} catch (Exception e) {
				output = "Error while updating project details...!";
				System.err.println(e.getMessage());
				System.out.println(e.getMessage());
				System.out.println(e);
				e.printStackTrace();
			}
			
			return output;
			
		}
		
		//delete
		public String deleteProject(String pid) {
			
			String output = "";
			
			Connection con = connect();
			if (con == null) {
				return "Error while connecting to the database for updating.";
			}
			
			try {
				
				String query = "DELETE FROM project WHERE pid=?";
				PreparedStatement ps = con.prepareStatement(query);
				
//				System.out.println(query);
//				System.out.println(pid);
				
				ps.setInt(1, Integer.parseInt(pid));
				
				ps.execute();
				con.close();
				output = "Project has been deleted successfully";
				
			} catch (SQLException e) {
				
				output = "Error while deleting the project from the database.";
				System.err.println(e.getMessage());
				System.out.println(e.getMessage());
				System.out.println(e);
				e.printStackTrace();
				
			}
			
			
			return output;
			
		}
}



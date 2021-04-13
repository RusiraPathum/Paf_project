package com.gadget_badget.project.model;

import java.sql.*;

public class ProjectServlet {
	
		private static Connection connect() {
			
			Connection con = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gadgetbadget", "root", "");
				
				System.out.println("succsess");
			} catch (Exception e) {
//				System.out.println(e);
				e.printStackTrace();
			}
			return con;
			
		}
		
		
		public static String readProjects() {
			String output = "";

			try {
				Connection con = connect();
				if (con == null) {
					return "Error while connecting to the database for reading.";
				}
				// Prepare the html table to be displayed

				String query = "SELECT * FROM project";
				System.out.println(query);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				// iterate through the rows in the result set
				while (rs.next()) {
					String projectID = Integer.toString(rs.getInt("pid"));
					String projectCode = rs.getString("project_category");
					String projectName = rs.getString("project_name");
					String projectDesc = rs.getString("short_des");
					String projectDevBy = rs.getString("date");
					String projectPrice = rs.getString("project_goal");
//					String projectCategory = rs.getString("long_des");
					
					System.out.println(projectID);
					System.out.println(projectName);

					// Add into the html table
					output += "<tr><td style='padding:10px; text-align:center;'>" + projectCode + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectName + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectDesc + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectDevBy + "</td>";
					output += "<td style='padding:10px; text-align:center;'>" + projectPrice + "</td>";
//					output += "<td style='padding:10px; text-align:center;'>" + projectCategory + "</td>";

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
				System.err.println(e.getMessage());
			}
			return output;
		}
		
		
		
		public static void main(String[] args) {
			connect();
			readProjects();
		}
	
	}



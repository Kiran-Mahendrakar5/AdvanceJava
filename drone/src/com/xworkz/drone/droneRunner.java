package com.xworkz.drone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class droneRunner {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		Connection connecter = DriverManager.getConnection("jdbc:mysql://localhost:3306/drone","root","Xworkzodc@123");
		System.out.println(connecter);
		
		//writing query
		String query = "insert into drone values(11,'hexo','btm')";

		
		//create statement object
		Statement statement = connecter.createStatement(); 
		
		//Executing statement to get the result
		boolean insert = statement.execute(query);
		System.out.println(insert);
		
//		int i = statement.executeUpdate(query);
//		System.out.println("effect row;"+i);
		
		
		//close connection
		connecter.close();
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

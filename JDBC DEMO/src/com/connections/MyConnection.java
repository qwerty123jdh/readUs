package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {

	private static Connection con;
	
	
	public static void closeMyConnection()
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getMyconnection() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try {
				con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI", "sa", "sa123");
			    System.out.println("connection successful");
				    
			    
			    		
			    	
			    
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
		
		
	}
	
}
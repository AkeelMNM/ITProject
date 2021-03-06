package com.fms.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection;
	
	// This works according to singleton pattern
	private DBConnection()
	{
		
	}
	
	//Create Database connection for the given URL, User name and Password
	
	public static Connection getDBConnection() throws ClassNotFoundException,SQLException
	{
		if (connection == null || connection.isClosed())
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FactoryMSDB","root","root");
		}
		return connection;
	}
	
}

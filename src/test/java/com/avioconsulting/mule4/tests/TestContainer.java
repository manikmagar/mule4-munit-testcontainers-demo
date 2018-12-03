package com.avioconsulting.mule4.tests;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestContainer {

	private static Connection connection;

	public static void start(final String jdbcUrl, final String driverClass, final String username, final String password) {
		try {
			Class.forName(driverClass);
			connection = DriverManager.getConnection(jdbcUrl, username, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void stop() {
		try {
			if(connection != null) connection.close();
			connection = null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

package Chuongtrinhquanly.Entity;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	private static final String jdbcurl = "jdbc:mysql://localhost:3306/mydatabase";
	private static final String username = "root";
	private static final String password = "root";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcurl,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}

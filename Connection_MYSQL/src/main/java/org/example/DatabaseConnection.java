package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String jdbcurl = "jdbc:mysql://localhost:3306/dbfpt";
    private static final String username = "root";
    private static final String password = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcurl,username,password);
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại!");
            throw new RuntimeException(e);
        }
        return connection;
    }
}

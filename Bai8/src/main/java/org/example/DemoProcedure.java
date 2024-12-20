package org.example;

import java.sql.*;

public class DemoProcedure {
    public static void main(String[] args) throws SQLException {
        String jdbcurl = "jdbc:mysql://localhost:3306/dbfpt";
        String username = "root";
        String password = "";

        Connection conn = DriverManager.getConnection(jdbcurl, username, password);
        String procedureCall = "{CALL GetStudentsByClass(?)}";
        CallableStatement cstmt = conn.prepareCall(procedureCall);
        cstmt.setString(1, "PHP");
        ResultSet rs = cstmt.executeQuery();
        while (rs.next()) {
            int javaId = rs.getInt("id");
            String javaName = rs.getString("name");
            int javaAge = rs.getInt("age");
            String javaCountry = rs.getString("country");
            String javaClass = rs.getString("clazz");

            System.out.println(javaId + " - " + javaName + " - " + javaAge + " - " + javaCountry + " - " + javaClass);
        }

    }
}

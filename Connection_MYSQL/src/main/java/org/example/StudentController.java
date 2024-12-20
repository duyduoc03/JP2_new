package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentController {
    public void getAllData() throws SQLException {
        String sqlshowdata = "SELECT * FROM students;";
        Connection ketnoi = DatabaseConnection.getConnection();
        PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
        ResultSet ketquatrave = statement.executeQuery();
        while(ketquatrave.next()) {
            int javaid = ketquatrave.getInt("id");
            String javaname = ketquatrave.getString("name");
            int javaage = ketquatrave.getInt("age");
            String javacountry = ketquatrave.getString("country");
            String javaclazz = ketquatrave.getNString("clazz") ;
            System.out.println(javaid+" - "+javaname+" - "+javaage+" - "+javacountry+" - "+javaclazz);
        }
    }
    public void getDataByID() throws SQLException {
        String sqlshowdatabyid = "SELECT * FROM students WHERE id = ?;";
        Connection ketnoi = DatabaseConnection.getConnection();
        PreparedStatement statement = ketnoi.prepareStatement(sqlshowdatabyid);
        statement.setInt(1, 1);
        ResultSet ketquatrave = statement.executeQuery();

        if (ketquatrave.next()) {
            int javaid = ketquatrave.getInt("id");
            String javaname = ketquatrave.getString("name");
            int javaage = ketquatrave.getInt("age");
            String javacountry = ketquatrave.getString("country");
            String javaclazz = ketquatrave.getString("clazz");

            System.out.println(javaid + " - " + javaname + " - " + javaage + " - " + javacountry + " - " + javaclazz);
        } else {
            System.out.println("Không tìm thấy dữ liệu với ID đã cho.");
        }
    }

    public void insertData() throws SQLException {
        String sqlinsert = "INSERT INTO students (name,age,country,clazz)\r\n"
                + "VALUES(?,?,?,?);";
        Connection ketnoi = DatabaseConnection.getConnection();
        PreparedStatement statement = ketnoi.prepareStatement(sqlinsert);
        statement.setString(1, "Nguyen Van A");
        statement.setInt(2, 40);
        statement.setString(3, "SG");
        statement.setString(4, "PHP");
        statement.executeUpdate();
        System.out.println("Inserted data successfully");
    }

    public void editData() throws SQLException {
        String sqlupdate = "UPDATE students SET name = ?, age = ? WHERE id = ?;";
        Connection ketnoi = DatabaseConnection.getConnection();
        PreparedStatement statement = ketnoi.prepareStatement(sqlupdate);
        statement.setString(1, "Nguyen Van B");
        statement.setInt(2, 45);
        statement.setInt(3, 3);
        statement.executeUpdate();
        System.out.println("Edit data successfully");
    }

    public void deleteData() throws SQLException {
        String sqldelete = "DELETE FROM students WHERE id = ?;";
        Connection ketnoi = DatabaseConnection.getConnection();
        PreparedStatement statement = ketnoi.prepareStatement(sqldelete);
        statement.setInt(1, 3);
        statement.executeUpdate();
        System.out.println("Xoa du lieu thanh cong");
    }
}

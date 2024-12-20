package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentController student = new StudentController();
//        student.getDataByID();
//        student.insertData();
//        student.editData();
//        student.deleteData();
        student.getAllData();
    }
}
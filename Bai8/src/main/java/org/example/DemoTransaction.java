package org.example;

import java.sql.*;

public class DemoTransaction {
    public static void main(String[] args) throws SQLException {
        String jdbcurl = "jdbc:mysql://localhost:3306/dbfpt";
        String username = "root";
        String password = "";

        Connection conn = null;

        try {
            // Kết nối tới cơ sở dữ liệu
            conn = DriverManager.getConnection(jdbcurl, username, password);
            conn.setAutoCommit(false); // Tắt chế độ tự động commit

            // Insert student
            String sqlInsert = "INSERT INTO students (name, age, country, clazz) VALUES (?, ?, ?, ?);";
            try (PreparedStatement statement = conn.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, "Nguyen Van A");
                statement.setInt(2, 40);
                statement.setString(3, "HN");
                statement.setString(4, "PHP");
                statement.executeUpdate();
                System.out.println("Inserted Student successfully");

                // Lấy ID của student vừa thêm (nếu cần dùng)
                ResultSet generatedKeys = statement.getGeneratedKeys();
                int studentId = 0;
                if (generatedKeys.next()) {
                    studentId = generatedKeys.getInt(1);
                }

                // Insert enrollment
                String sqlInsertEnrollment = "INSERT INTO enrollments (student_id, course_name) VALUES (?, ?);";
                try (PreparedStatement statement2 = conn.prepareStatement(sqlInsertEnrollment)) {
                    statement2.setInt(1, studentId); // Gán student_id vừa thêm
                    statement2.setString(2, "JAVA");
                    statement2.executeUpdate();
                    System.out.println("Inserted Enrollment successfully");
                }

                // Delete enrollment
                String sqlDeleteEnrollment = "DELETE FROM enrollments WHERE student_id = ?;";
                try (PreparedStatement statement3 = conn.prepareStatement(sqlDeleteEnrollment)) {
                    statement3.setInt(1, studentId);
                    statement3.executeUpdate();
                    System.out.println("Deleted Enrollment successfully");
                }

                // Delete student
                String sqlDeleteStudent = "DELETE FROM students WHERE id = ?;";
                try (PreparedStatement statement4 = conn.prepareStatement(sqlDeleteStudent)) {
                    statement4.setInt(1, studentId);
                    statement4.executeUpdate();
                    System.out.println("Deleted Student successfully");
                }
            }

            // Commit transaction
            conn.commit();
            System.out.println("Transaction committed successfully");

        } catch (SQLException e) {
            // Rollback transaction nếu có lỗi
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Transaction rolled back successfully");
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Đóng kết nối
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connection closed successfully");
                } catch (SQLException closeEx) {
                    closeEx.printStackTrace();
                }
            }
        }
    }
}

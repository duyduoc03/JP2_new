package student_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_management"; // CSDL
    private static final String USERNAME = "root"; // Tên đăng nhập
    private static final String PASSWORD = ""; // Mật khẩu

    // Phương thức lấy kết nối
    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại!");
            throw new RuntimeException(e);
        }

        return connection;
    }
}

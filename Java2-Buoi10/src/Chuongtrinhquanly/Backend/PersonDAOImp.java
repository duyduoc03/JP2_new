package Chuongtrinhquanly.Backend;

import java.sql.*;
import java.util.List;

import Chuongtrinhquanly.Entity.*;

public class PersonDAOImp implements PersonDAO {
//	Student student = new Student();
//	Mentor mentor = new Mentor();
	@Override
	public void addStudent(Student student) {
		String sql = "INSERT INTO Person (name, age, country, diemtin, diemtoan, role) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = Connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getCountry());
            preparedStatement.setDouble(4, student.getDiemTin());
            preparedStatement.setDouble(5, student.getDiemToan());
            preparedStatement.setInt(6, 0); // role = 0 cho Student

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Thêm Student thành công!");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm Student: " + e.getMessage());
        }	
	}

	@Override
	public void addMentor(Mentor mentor) {
        String sql = "INSERT INTO Person (name, age, country, ngaycong, role) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = Connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, mentor.getName());
            preparedStatement.setInt(2, mentor.getAge());
            preparedStatement.setString(3, mentor.getCountry());
            preparedStatement.setInt(4, mentor.getNgayCong());
            preparedStatement.setInt(5, 1); // role = 1 cho Mentor

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Thêm Mentor thành công!");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm Mentor: " + e.getMessage());
        }
	}
	
	public void displayAll() {
	    String sql = "SELECT * FROM Person";
	    try (Connection connection = Connect.getConnection();
	         Statement statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(sql)) {
	    	System.out.println("+----------------+-----+----------+--------+");
	        System.out.println("| Name           | Age | Country  | Role   |");
	        System.out.println("+----------------+-----+----------+--------+");
	        while (resultSet.next()) {
	            int id = resultSet.getInt("id");
	            String name = resultSet.getString("name");
	            int age = resultSet.getInt("age");
	            String country = resultSet.getString("country");
	            int role = resultSet.getInt("role");
	            
	            if (role == 0) { // Student
                    double diemTin = resultSet.getDouble("diemtin");
                    double diemToan = resultSet.getDouble("diemtoan");
                    Student student = new Student(name, age, country);
                    student.displayInfo2();
                } else if (role == 1) { // Mentor
                    int ngayCong = resultSet.getInt("ngaycong");
                    Mentor mentor = new Mentor(name, age, country);
                    mentor.displayInfo2();
                }
                System.out.println("--------------");
	        }
	    } catch (Exception e) {
	        System.out.println("Lỗi khi hiển thị dữ liệu: " + e.getMessage());
	    }
	}
	
	@Override
	public void deletePerson(int id) {
	    String sql = "DELETE FROM Person WHERE id = ?";
	    try (Connection connection = Connect.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	        preparedStatement.setInt(1, id);
	        int rowsDeleted = preparedStatement.executeUpdate();
	        if (rowsDeleted > 0) {
	            System.out.println("Xóa thành công!");
	        } else {
	            System.out.println("Không tìm thấy người với ID này.");
	        }
	    } catch (Exception e) {
	        System.out.println("Lỗi khi xóa dữ liệu: " + e.getMessage());
	    }
	}
	@Override
	public void updatePerson(int id, String name, int age, String country) {
	    String sql = "UPDATE Person SET name = ?, age = ?, country = ? WHERE id = ?";
	    try (Connection connection = Connect.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	        preparedStatement.setString(1, name);
	        preparedStatement.setInt(2, age);
	        preparedStatement.setString(3, country);
	        preparedStatement.setInt(4, id);

	        int rowsUpdated = preparedStatement.executeUpdate();
	        if (rowsUpdated > 0) {
	            System.out.println("Cập nhật thành công!");
	        } else {
	            System.out.println("Không tìm thấy người với ID này.");
	        }
	    } catch (Exception e) {
	        System.out.println("Lỗi khi cập nhật dữ liệu: " + e.getMessage());
	    }
	}

	@Override
	public void displayStudents() {
		String sql = "SELECT * FROM Person WHERE role = 0"; // role = 0 cho Student
	    try (Connection connection = Connect.getConnection();
	         Statement statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(sql)) {
	    	System.out.println("+----+----------------+-----+----------+--------+--------+-----------------+");
	        System.out.println("| ID | Name           | Age | Country  | Role   | Tin    | Toán   | Trung Bình      |");
	        System.out.println("+----+----------------+-----+----------+--------+--------+--------+-----------------+");
	        while (resultSet.next()) {
	            int id = resultSet.getInt("id");
	            String name = resultSet.getString("name");
	            int age = resultSet.getInt("age");
	            String country = resultSet.getString("country");
	            double diemTin = resultSet.getDouble("diemtin");
	            double diemToan = resultSet.getDouble("diemtoan");
	            Student student = new Student(id, name, age, country, diemTin, diemToan);

	            student.displayInfo();
	        }
	    } catch (Exception e) {
	        System.out.println("Lỗi khi hiển thị dữ liệu Student: " + e.getMessage());
	    }
	}

	@Override
	public void displayMentors() {
		String sql = "SELECT * FROM Person WHERE role = 1"; // role = 1 cho Mentor
	    try (Connection connection = Connect.getConnection();
	         Statement statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(sql)) {
	    	System.out.println("+----+----------------+-----+----------+--------+----------+------------+");
	        System.out.println("| ID | Name           | Age | Country  | Role   | Ngày Công | Tiền Lương |");
	        System.out.println("+----+----------------+-----+----------+--------+----------+------------+");

	        while (resultSet.next()) {
	            int id = resultSet.getInt("id");
	            String name = resultSet.getString("name");
	            int age = resultSet.getInt("age");
	            String country = resultSet.getString("country");
	            int ngayCong = resultSet.getInt("ngaycong");
	            Mentor mentor = new Mentor(id, name, age, country, ngayCong);

	            mentor.displayInfo();
	        }
	    } catch (Exception e) {
	        System.out.println("Lỗi khi hiển thị dữ liệu Mentor: " + e.getMessage());
	    }	
	}
}





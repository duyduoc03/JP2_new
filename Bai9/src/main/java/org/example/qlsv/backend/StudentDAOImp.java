package org.example.qlsv.backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.example.qlsv.entity.Connect;
import org.example.qlsv.entity.Student;

public class StudentDAOImp implements StudentDAO {
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		String sqlshowdata = "SELECT * FROM dbfpt.students;";
		try {
			Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
			ResultSet ketqua = statement.executeQuery();
			while (ketqua.next()) {
				String name = ketqua.getString("name");
				int id = ketqua.getInt("id");
				int age = ketqua.getInt("age");
				String country = ketqua.getString("country");
				String clazz = ketqua.getString("clazz");
				Student student = new Student(name, id, age, country, clazz);
				students.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
	
	@Override
	public void addStudent(Student student) {
		String sqlinsert = "INSERT INTO students (`name`,age, country, clazz)\r\n"
				+ "VALUES (?,?,?,?);";
		try {
			Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlinsert);
			statement.setString(1, student.getName());
			statement.setInt(2, student.getAge());
			statement.setString(3, student.getCountry());
			statement.setString(4, student.getClazz());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	@Override
	public void deleteStudent(int id) {
		
	}

}

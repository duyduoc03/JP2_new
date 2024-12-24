package org.example.backend;

import org.example.entity.Connect;
import org.example.entity.Person;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImp implements PersonDAO {
	
	@Override
	public List<Person> getAllPersons() {
		List<Person> people = new ArrayList<>();
		String sqlshowdata = "SELECT * FROM Person;";
		try {
			Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
			ResultSet ketqua = statement.executeQuery();
			while (ketqua.next()) {
				int id = ketqua.getInt("id");
				String name = ketqua.getString("name");
				int age = ketqua.getInt("age");
				String country = ketqua.getString("country");
				BigDecimal diemtin = ketqua.getBigDecimal("diemtin");
				BigDecimal diemtoan = ketqua.getBigDecimal("diemtoan");
				BigDecimal ngaycong = ketqua.getBigDecimal("ngaycong");
				int role_id = ketqua.getInt("role_id");
				Person person = new Person(id, name, age, country, diemtin, diemtoan, ngaycong, role_id);
				people.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return people;
	}
	
	@Override
	public void addPerson(Person person) {
		String sqlinsert = "INSERT INTO Person (name, age, country, diemtin, diemtoan, ngaycong, role_id)\r\n"
				+ "VALUES (?,?,?,?,?,?,?);";
		try {
			Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlinsert);
			int defaultRoleId = person.getRole_id() != 0 ? person.getRole_id() : 1;

			statement.setString(1, person.getName());
			statement.setInt(2, person.getAge());
			statement.setString(3, person.getCountry());
			statement.setBigDecimal(4, person.getDiemtin());
			statement.setBigDecimal(5, person.getDiemtoan());
			statement.setBigDecimal(6, person.getNgaycong());
			statement.setInt(7, defaultRoleId);
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Person> getAllStudents() {
		List<Person> people = new ArrayList<>();
		String sqlshowdata = "SELECT * FROM Person p " +
				"JOIN roles r ON p.role_id = r.id " +
				"WHERE r.name = 'student';";
		try {
			Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
			ResultSet ketqua = statement.executeQuery();
			while (ketqua.next()) {
				int id = ketqua.getInt("id");
				String name = ketqua.getString("name");
				int age = ketqua.getInt("age");
				String country = ketqua.getString("country");
				BigDecimal diemtin = ketqua.getBigDecimal("diemtin");
				BigDecimal diemtoan = ketqua.getBigDecimal("diemtoan");
				BigDecimal ngaycong = ketqua.getBigDecimal("ngaycong");
				int role_id = ketqua.getInt("role_id");
				Person person = new Person(id, name, age, country, diemtin, diemtoan, ngaycong, role_id);
				people.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return people;
	}

	@Override
	public List<Person> getAllMentors() {
		List<Person> people = new ArrayList<>();
		String sqlshowdata = "SELECT * FROM Person p " +
				"JOIN roles r ON p.role_id = r.id " +
				"WHERE r.name = 'mentor';";
		try {
			Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
			ResultSet ketqua = statement.executeQuery();
			while (ketqua.next()) {
				int id = ketqua.getInt("id");
				String name = ketqua.getString("name");
				int age = ketqua.getInt("age");
				String country = ketqua.getString("country");
				BigDecimal diemtin = ketqua.getBigDecimal("diemtin");
				BigDecimal diemtoan = ketqua.getBigDecimal("diemtoan");
				BigDecimal ngaycong = ketqua.getBigDecimal("ngaycong");
				int role_id = ketqua.getInt("role_id");
				Person person = new Person(id, name, age, country, diemtin, diemtoan, ngaycong, role_id);
				people.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return people;
	}


}

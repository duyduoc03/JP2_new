package org.example.entity;

import java.math.BigDecimal;

public class Person {
	private int id;
	private String name;
	private int age;
	private String country;
	private BigDecimal diemtin;
	private BigDecimal diemtoan;
	private BigDecimal ngaycong;
	private int role_id;

	public Person() {
	}

	public Person(int id, String name, int age, String country, BigDecimal diemtin, BigDecimal diemtoan, BigDecimal ngaycong, int role_id) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
		this.diemtin = diemtin;
		this.diemtoan = diemtoan;
		this.ngaycong = ngaycong;
		this.role_id = role_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getDiemtin() {
		return diemtin;
	}

	public void setDiemtin(BigDecimal diemtin) {
		this.diemtin = diemtin;
	}

	public BigDecimal getDiemtoan() {
		return diemtoan;
	}

	public void setDiemtoan(BigDecimal diemtoan) {
		this.diemtoan = diemtoan;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public BigDecimal getNgaycong() {
		return ngaycong;
	}

	public void setNgaycong(BigDecimal ngaycong) {
		this.ngaycong = ngaycong;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", country='" + country + '\'' +
				", diemtin=" + diemtin +
				", diemtoan=" + diemtoan +
				", ngaycong=" + ngaycong +
				", diem trung binh=" + diemtin + diemtoan + ')' /2 +
				", role_id=" + role_id +
				'}';
	}
}

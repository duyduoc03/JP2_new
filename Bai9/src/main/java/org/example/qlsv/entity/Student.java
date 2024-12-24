package org.example.qlsv.entity;

public class Student {
	private String name;
	private int id;
	private int age;
	private String country;
	private String clazz;
	
	public Student(String name, int id, int age, String country, String clazz) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.country = country;
		this.clazz = clazz;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", country=" + country + ", clazz=" + clazz
				+ "]";
	}
	
	
	
	
}

package org.example;

public class Student {
	int id;
	String name;
	int age;
	String country;
	private static Student _instance;
	
	private Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public static Student GetInstance(int id, String name, int age) {
		if (_instance==null) {
			_instance = new Student(id, name,age);
		}
		return _instance;
	}
	
	
}

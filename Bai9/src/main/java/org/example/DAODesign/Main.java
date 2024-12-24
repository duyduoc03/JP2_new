package org.example.DAODesign;

public class Main {
	public static void main(String[] args) {
		StudentDaoImpl std1 = new StudentDaoImpl();
		std1.deleteStudent(null);
		std1.getStudent();
		std1.updateStudent(null);
	}
}

package org.example;

public class Main {
	public static void main(String[] args) {
//		Student std1 = new Student(1, "Abc", 20);
//		std1.country = "SG";
//		Student std2 = new Student(2, "Def", 21);
//		
//		System.out.println(std1 == std2);
		Student std1 = Student.GetInstance(1, "Abc", 20);
		Student std2 = Student.GetInstance(2, "Def", 21);
		System.out.println(std1 == std2);
		
		Vietnam person1 = new Vietnam();
		person1.eat();
	}
}

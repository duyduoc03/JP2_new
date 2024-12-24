package org.example.frontend;

import org.example.backend.PersonDAOImp;
import org.example.entity.Person;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		PersonDAOImp personDAO = new PersonDAOImp();

		// Tạo một đối tượng Person
//		Person newPerson = new Person();
//		newPerson.setName("Nguyen Van B");
//		newPerson.setAge(20);
//		newPerson.setCountry("HCM");
//		newPerson.setDiemtin(new BigDecimal("8.5"));
//		newPerson.setDiemtoan(new BigDecimal("9.0"));
//		newPerson.setNgaycong(new BigDecimal("15"));
//
//		personDAO.addPerson(newPerson);

		//show
		//all
//		List<Person> people = personDAO.getAllPersons();
//		System.out.println("List person: ");
//		for (Person person : people) {
//            System.out.println(person);
//        }

		// student
		List<Person> students = personDAO.getAllStudents();
		System.out.println("List student: ");
		for (Person student : students) {
			System.out.println(student);
		}

		// student
		List<Person> mentors = personDAO.getAllMentors();
		System.out.println("List mentor: ");
		for (Person mentor : mentors) {
			System.out.println(mentor);
		}


	}
}

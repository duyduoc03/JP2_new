package org.example.backend;

import org.example.entity.Person;

import java.util.List;

public interface PersonDAO {
	public void addPerson(Person person);
	public List<Person> getAllPersons();
	public List<Person> getAllStudents();
	public List<Person> getAllMentors();
}

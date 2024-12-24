package Chuongtrinhquanly.Backend;

import java.util.List;

import Chuongtrinhquanly.Entity.Mentor;
import Chuongtrinhquanly.Entity.Person;
import Chuongtrinhquanly.Entity.Student;


public interface PersonDAO {
	public void addStudent(Student student);
	public void addMentor(Mentor mentor);
	public void displayAll();
	public void deletePerson(int id);
	public void updatePerson(int id, String name, int age, String country);
	public void displayStudents();
	public void displayMentors();
}

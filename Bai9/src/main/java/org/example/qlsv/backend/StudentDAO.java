package org.example.qlsv.backend;

import java.util.List;

import org.example.qlsv.entity.Student;

public interface StudentDAO {
	public void addStudent(Student student);
	public List<Student> getAllStudents();
	public void deleteStudent(int id);
}

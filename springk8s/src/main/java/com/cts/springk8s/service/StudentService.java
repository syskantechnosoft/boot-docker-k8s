package com.cts.springk8s.service;

import java.util.List;
import java.util.Optional;

import com.cts.springk8s.model.Student;

public interface StudentService {
	public List<Student> getStudents();

	public Optional<Student> getStudentById(int id);

	public Student addStudent(Student student);

	public void editStudent(int id, Student student);

	public void deleteStudent(int id);
}

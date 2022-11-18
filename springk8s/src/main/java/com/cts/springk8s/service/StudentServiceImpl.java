package com.cts.springk8s.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springk8s.model.Student;
import com.cts.springk8s.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void editStudent(int id, Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}

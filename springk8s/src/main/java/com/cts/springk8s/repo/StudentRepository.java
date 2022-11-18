package com.cts.springk8s.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springk8s.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

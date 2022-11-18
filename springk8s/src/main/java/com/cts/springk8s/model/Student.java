package com.cts.springk8s.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity // adds JPA annotations / marks this class as an entity
@Data
public class Student {
	@Id // adds a primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // Indicates that the Id field is automatically generated
	private int id;
	private String name;
	private String regNo;
	private String course;
}

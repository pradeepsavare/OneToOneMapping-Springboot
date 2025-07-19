package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
	

	@Id
	private String lid;
	
	@Column
	private String model;
	
	@OneToOne@JoinColumn(name = "id")
	private Student student;
	
	

	public Laptop(String lid, String model, Student student) {
		super();
		this.lid = lid;
		this.model = model;
		this.student = student;
	}

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}

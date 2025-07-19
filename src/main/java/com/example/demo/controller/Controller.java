package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.repo;
import com.example.demo.entity.Laptop;
import com.example.demo.entity.Student;

@RestController
@RequestMapping("/app")
public class Controller {

	@Autowired
	private repo repo;
	
	@GetMapping("/one")
	public String demo(){
		Student st = new Student();
		st.setName("deep");
		st.setEmail("deep@gmail.com");
		
		Laptop lp = new Laptop();
		lp.setLid("BP110");
		lp.setModel("acer");
		lp.setStudent(st);
		
		st.setLaptop(lp);
		System.out.println("data:" + st);
		 Student res = repo.save(st);
		 System.out.println("Student name:" +res.getName());
		
		return "added";
	}
}

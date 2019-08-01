package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(value = "/rest/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value = "/all")
	public List<Student> findAll(){
		return studentService.findAll();
	}
}

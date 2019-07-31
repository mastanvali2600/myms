package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;

@RestController
@RequestMapping(value = "/rest")
public class SubjectController {
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping(value = "/subjects")
	public List<Subject> findAll(){
		return subjectService.findAll();
	}
}

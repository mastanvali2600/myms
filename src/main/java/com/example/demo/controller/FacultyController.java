package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Faculty;
import com.example.demo.service.FacultyService;

@RestController
@RequestMapping(value = "/rest/faculties")
public class FacultyController {

	@Autowired
	private FacultyService facultyService;
	
	@GetMapping(value = "/all")
	public List<Faculty> findAll(){
		return facultyService.findAll();
	}
}

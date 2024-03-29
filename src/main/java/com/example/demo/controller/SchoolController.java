package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.School;
import com.example.demo.service.SchoolService;

@RestController
@RequestMapping(value = "/rest/schools")
public class SchoolController {
	@Autowired
	private SchoolService schoolService;

	@GetMapping(value = "/all")
	public List<School> findAll() {
		return schoolService.findAll();
	}

}

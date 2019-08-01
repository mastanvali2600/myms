package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Test;
import com.example.demo.service.TestService;

@RestController
@RequestMapping(value = "/rest/tests")
public class TestController {
	@Autowired
	private TestService testService;
	
	@GetMapping(value = "/all")
	public List<Test> findAll(){
		return testService.findAll();
	}
}

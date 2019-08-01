package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Parent;
import com.example.demo.service.ParentService;

@RestController
@RequestMapping(value = "/rest/parents")
public class ParentController {

	@Autowired
	private ParentService parentService;
	
	@GetMapping(value = "/all")
	public List<Parent> findAll(){
		return parentService.findAll();
	}
}

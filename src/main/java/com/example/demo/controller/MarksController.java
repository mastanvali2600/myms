package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mark;
import com.example.demo.service.MarksService;

@RestController
@RequestMapping(value = "/rest/marks")
public class MarksController {

	@Autowired
	private MarksService marksService;
	
	@GetMapping(value = "/all")
	public List<Mark> findAll(){
		return marksService.findAll();
	}
}

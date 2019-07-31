package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HomeWork;
import com.example.demo.service.HomeWorkService;

@RestController
@RequestMapping(value = "/rest")
public class HomeWorkController {
	@Autowired
	private HomeWorkService homeWorkService;
	
	@GetMapping(value = "/homeworks")
	public List<HomeWork> findAll(){
		return homeWorkService.findAll();
	}
}

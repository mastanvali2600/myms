package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClassInfo;
import com.example.demo.service.ClassInfoService;

@RestController
@RequestMapping(value = "/rest/classInfos")
public class ClassInfoController {
	
	@Autowired
	private ClassInfoService classInfoService;
	
	@GetMapping(value = "/all")
	public List<ClassInfo> findAll(){
		return classInfoService.findAll();
	}
}

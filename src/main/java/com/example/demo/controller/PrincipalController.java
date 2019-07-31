package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Principal;
import com.example.demo.service.PrincipalService;

@RestController
@RequestMapping(value = "/rest")
public class PrincipalController {
	
	@Autowired
	private PrincipalService principalService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/ap")
	public String home() {
		principalService.addPrincipalList();
		return "home1";
	}
	@GetMapping(value = "/principals")
	public List<Principal> findAll(){
		return principalService.findAll();
	}
}

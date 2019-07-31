package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Attendance;
import com.example.demo.service.AttendanceService;

@RestController(value = "/rest")
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;
	
	@GetMapping(value = "/attendance")
	public List<Attendance> findAll(){
		return attendanceService.findAll();
	}
}

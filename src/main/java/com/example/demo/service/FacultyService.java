package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Faculty;
import com.example.demo.model.Principal;
import com.example.demo.repository.FacultyRepository;

@Service
public class FacultyService {

	@Autowired
	private FacultyRepository facultyRepository;

	public void save(String facultyId, String name, String email, String password, String address, String phoneNumber,
			Principal principal) {
		facultyRepository.save(Faculty.instance(facultyId, name, email, password, phoneNumber, address, principal));
	}

	public List<Faculty> findAll() {
		return facultyRepository.findAll();
	}
	
	public Faculty findOne(String id) {
		return facultyRepository.findOne(id);
	}
}

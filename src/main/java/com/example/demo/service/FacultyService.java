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
		Faculty faculty = new Faculty();
		faculty.setAddress(address);
		faculty.setName(name);
		faculty.setFacultyId(facultyId);
		faculty.setEmail(email);
		faculty.setPassword(password);
		faculty.setPhoneNumber(phoneNumber);
		faculty.setPrincipal(principal);

		facultyRepository.save(faculty);
	}

	public List<Faculty> findAll() {
		return facultyRepository.findAll();
	}
	
	public Faculty findOne(String id) {
		return facultyRepository.findOne(id);
	}
}

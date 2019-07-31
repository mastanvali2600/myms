package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Faculty;
import com.example.demo.model.Principal;
import com.example.demo.repository.FacultyRepository;

@Service
public class FacultyService {

	@Autowired
	private FacultyRepository facultyRepository;
	
	public void save(String facultyId, String name, String email, String address,String phoneNumber,Principal principal) {
		Faculty faculty=new Faculty();
		faculty.setAddress(address);
		faculty.setName(name);
		faculty.setFacultyId(facultyId);
		faculty.setEmail(email);
		faculty.setPhoneNumber(phoneNumber);
		faculty.setPrincipal(principal);
		
		facultyRepository.save(faculty);
	}
}

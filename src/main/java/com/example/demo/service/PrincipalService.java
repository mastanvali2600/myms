package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Faculty;
import com.example.demo.model.Principal;
import com.example.demo.model.School;
import com.example.demo.repository.FacultyRepository;
import com.example.demo.repository.PrincipalRepository;
import com.example.demo.repository.SchoolRepository;

@Service
public class PrincipalService {
	@Autowired
	private PrincipalRepository principalRepository;
	
	@Autowired
	private SchoolRepository schoolRepository;
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	public List<Principal> findAll(){
		return principalRepository.findAll();
	}
	public void addPrincipalList() {
		Principal principal=new Principal();
		principal.setPrincipalJoinId("ABCD");
		principal.setEmail("abc@gmail.com");
		principal.setName("abc");
		principal.setPassword("abc");
		principal.setPhoneNumber("9999999999");
		
		Principal principal1=new Principal();
		principal1.setPrincipalJoinId("ABCDE");
		principal1.setEmail("abcE@gmail.com");
		principal1.setName("abcE");
		principal1.setPassword("abcE");
		principal1.setPhoneNumber("9999999991");
		

		School school=new School();
		school.setSchoolId("Sc1");
		school.setName("Zph School");
		school.setAddress("Vkpd");
		
		principal.setSchool(school);
		
		Faculty faculty=new Faculty();
		faculty.setFacultyId("fc1");
		faculty.setName("Sriman");
		faculty.setEmail("sriman@gmail.com");
		faculty.setPassword("sriman");
		faculty.setPhoneNumber("8888888888");
		faculty.setAddress("Hyd");

		schoolRepository.save(school);
		
		List<Principal> principals =new ArrayList<Principal>();
		principals.add(principal);
		principals.add(principal1);
		
		
		principalRepository.save(principals);
		
		faculty.setPrincipal(principal);

		facultyRepository.save(faculty);
	}
}

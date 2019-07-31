package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.School;
import com.example.demo.repository.SchoolRepository;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	public void save(String schoolId, String name, String address) {
		School school=new School();
		school.setSchoolId(schoolId);
		school.setName(name);
		school.setAddress(address);
		schoolRepository.save(school);
	}
	
	public List<School> findAll(){
		return schoolRepository.findAll();
	}
	
	public School findOne(String id) {
		return schoolRepository.findOne(id);
	}
}

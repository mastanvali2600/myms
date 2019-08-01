package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;
	
	public void save(String subjectId, String name) {
		subjectRepository.save(Subject.instance(subjectId, name));
	}
	public List<Subject> findAll(){
		return subjectRepository.findAll();
	}
	public Subject findOne(String id) {
		return subjectRepository.findOne(id);
	}
}

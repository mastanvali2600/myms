package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Test;
import com.example.demo.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;

	public void save(String testId, String name) {
		testRepository.save(Test.instance(testId, name));
	}
	public List<Test> findAll(){
		return testRepository.findAll();
	}
	public Test findOne(String id) {
		return testRepository.findOne(id);
	}
}

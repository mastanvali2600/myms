package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Test;
import com.example.demo.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;

	public void save(String testId, String name) {
		Test test = new Test();
		test.setTestId(testId);
		test.setName(name);

		testRepository.save(test);
	}
}

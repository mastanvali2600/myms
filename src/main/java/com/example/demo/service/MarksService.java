package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mark;
import com.example.demo.model.Student;
import com.example.demo.model.Subject;
import com.example.demo.model.Test;
import com.example.demo.model.composit.MarkPrimaryKey;
import com.example.demo.repository.MarksRepository;

@Service
public class MarksService {
	
	@Autowired
	private MarksRepository marksRepository;
	
	public void save(Student student, Subject subject,Test test, Long marks , Long outMarks) {
		marksRepository.save(
				Mark.instance(MarkPrimaryKey.instance(student, subject, test), marks, outMarks));
	}
	
	public List<Mark> findAll(){
		return marksRepository.findAll();
	}
}

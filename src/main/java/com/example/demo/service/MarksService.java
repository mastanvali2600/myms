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
		MarkPrimaryKey markPrimaryKey=new MarkPrimaryKey();
		markPrimaryKey.setStudents(student);
		markPrimaryKey.setSubject(subject);
		markPrimaryKey.setTest(test);
		
		Mark mark=new Mark();
		mark.setMarkPrimaryKey(markPrimaryKey);
		mark.setMarks(marks);
		mark.setOutMarks(outMarks);
		
		marksRepository.save(mark);
	}
	
	public List<Mark> findAll(){
		return marksRepository.findAll();
	}
}

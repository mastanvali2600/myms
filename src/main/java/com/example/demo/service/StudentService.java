package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClassInfo;
import com.example.demo.model.Parent;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void save(String studentId, String name, String rollNumber, Parent parent, ClassInfo classInfo) {
		Student student=new Student();
		student.setStudentId(studentId);
		student.setName(name);
		student.setRollNumber(rollNumber);
		student.setParent(parent);
		student.setClassInfo(classInfo);
		
		studentRepository.save(student);
	}
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	public Student findOne(String id) {
		return studentRepository.findOne(id);
	}
}

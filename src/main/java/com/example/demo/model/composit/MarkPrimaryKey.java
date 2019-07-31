package com.example.demo.model.composit;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.model.Student;
import com.example.demo.model.Subject;
import com.example.demo.model.Test;

@Embeddable
public class MarkPrimaryKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "studentId")
	private Student students;
	
	@ManyToOne
	@JoinColumn(name = "subjectId")
	private Subject subject;
	
	@ManyToOne
	@JoinColumn(name = "testId")
	private Test test;
	
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	@Override
	public String toString() {
		return "MarkPrimaryKey [students=" + students + ", subject=" + subject + ", test=" + test + "]";
	}
	
	

}

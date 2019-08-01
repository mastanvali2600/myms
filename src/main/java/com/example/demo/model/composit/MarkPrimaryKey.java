package com.example.demo.model.composit;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.model.Student;
import com.example.demo.model.Subject;
import com.example.demo.model.Test;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Embeddable
public class MarkPrimaryKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "studentId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "studentId")
	@JsonIdentityReference(alwaysAsId = true)
	private Student students;
	
	@ManyToOne
	@JoinColumn(name = "subjectId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "subjectId")
	@JsonIdentityReference(alwaysAsId = true)
	private Subject subject;
	
	@ManyToOne
	@JoinColumn(name = "testId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "testId")
	@JsonIdentityReference(alwaysAsId = true)
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

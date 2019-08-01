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
	
	private MarkPrimaryKey(Student students, Subject subject, Test test) {
		super();
		this.students = students;
		this.subject = subject;
		this.test = test;
	}

	public static MarkPrimaryKey instance(Student students, Subject subject, Test test) {
		return new MarkPrimaryKey(students, subject, test);
	}
	
	public Student getStudents() {
		return students;
	}

	public Subject getSubject() {
		return subject;
	}

	public Test getTest() {
		return test;
	}

	@Override
	public String toString() {
		return "MarkPrimaryKey [students=" + students + ", subject=" + subject + ", test=" + test + "]";
	}

}

package com.example.demo.model.composit;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.model.Student;
import com.example.demo.model.Subject;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Embeddable
public class AttendancePK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false,updatable = false)
	private String homeWorkDate;
	
	@ManyToOne
	@JoinColumn(name = "studentId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "studentId")
	@JsonIdentityReference(alwaysAsId = true)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "subjectId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "subjectId")
	@JsonIdentityReference(alwaysAsId = true)
	private Subject subject;


	public String getHomeWorkDate() {
		return homeWorkDate;
	}

	public void setHomeWorkDate(String homeWorkDate) {
		this.homeWorkDate = homeWorkDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "AttendancePK [homeWorkDate=" + homeWorkDate + ", student=" + student + ", subject=" + subject + "]";
	}
	
	
}

package com.example.demo.model.composit;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.model.ClassInfo;
import com.example.demo.model.Subject;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Embeddable
public class HomeWorkPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false,updatable = false)
	private String homeWorkDate;
	
	@ManyToOne
	@JoinColumn(name = "classSectionId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "classSectionId")
	@JsonIdentityReference(alwaysAsId = true)
	private ClassInfo classInfo;
	
	@ManyToOne
	@JoinColumn(name = "subjectId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "subjectId")
	@JsonIdentityReference(alwaysAsId = true)
	private Subject subject;

	public HomeWorkPK(String homeWorkDate, ClassInfo classInfo, Subject subject) {
		super();
		this.homeWorkDate = homeWorkDate;
		this.classInfo = classInfo;
		this.subject = subject;
	}
	public static HomeWorkPK instance(String homeWorkDate, ClassInfo classInfo, Subject subject) {
		return new HomeWorkPK(homeWorkDate, classInfo, subject);
	}
	
	public String getHomeWorkDate() {
		return homeWorkDate;
	}
	public ClassInfo getClassInfo() {
		return classInfo;
	}
	public Subject getSubject() {
		return subject;
	}
	@Override
	public String toString() {
		return "HomeWorkPK [homeWorkDate=" + homeWorkDate + ", classInfo=" + classInfo + ", subject=" + subject + "]";
	}
	
}

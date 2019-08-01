package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	@Id
	private String subjectId;
	private String name;
	
	@OneToMany(mappedBy = "id.subject",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Mark> marks;

	@OneToMany(mappedBy = "id.subject")
	private Set<HomeWork> homeWorks;
	
	@OneToMany(mappedBy = "id.subject")
	private Set<Attendance> attendances;

	private Subject() {
		super();
	}

	private Subject(String subjectId, String name) {
		super();
		this.subjectId = subjectId;
		this.name = name;
	}
	
	public static Subject instance(String subjectId, String name) {
		return new Subject(subjectId, name);
	}

	public String getSubjectId() {
		return subjectId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", name=" + name + ", marks=" + marks + ", homeWorks=" + homeWorks
				+ ", attendances=" + attendances + "]";
	}
}

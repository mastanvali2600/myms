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
	
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", name=" + name + ", marks=" + marks + ", homeWorks=" + homeWorks
				+ ", attendances=" + attendances + "]";
	}

}

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
	
	@OneToMany(mappedBy = "markPrimaryKey.subject",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Mark> marks;

	@OneToMany(mappedBy = "homeWorkPK.subject")
	private Set<HomeWork> homeWorks;
	
	@OneToMany(mappedBy = "attendancePK.subject")
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
	
	public Set<Mark> getMarks() {
		return marks;
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

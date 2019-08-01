package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Student {

	@Id
	private String studentId;
	
	private String rollNumber;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "classSectionId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "classSectionId")
	@JsonIdentityReference(alwaysAsId = true)
	private ClassInfo classInfo;
	
	@ManyToOne
	@JoinColumn(name = "parentId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "parentId")
	@JsonIdentityReference(alwaysAsId = true)
	private Parent parent;
	
	@OneToMany(mappedBy = "id.students",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Mark> marks;
	
	@OneToMany(mappedBy = "id.student",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Attendance> attendance;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}
	
	public void setAttendance(Set<Attendance> attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", rollNumber=" + rollNumber + ", name=" + name + ", classInfo="
				+ classInfo + ", parent=" + parent + ", marks=" + marks + ", attendance=" + attendance + "]";
	}


}

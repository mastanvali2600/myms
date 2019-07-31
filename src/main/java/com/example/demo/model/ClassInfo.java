package com.example.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ClassInfo {

	@Id
	private String classSectionId;
	
	private String className;
	
	private String sectionName;
	
	@OneToMany(mappedBy = "classInfo")
	private List<Student> students;
	
	@OneToMany(mappedBy = "homeWorkPK.classInfo")
	private Set<HomeWork> homeWorks;

	public String getClassSectionId() {
		return classSectionId;
	}

	public void setClassSectionId(String classSectionId) {
		this.classSectionId = classSectionId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public String createPK(String className,String sectionName) {
		return className+"-"+sectionName;
	}

	@Override
	public String toString() {
		return "ClassInfo [classSectionId=" + classSectionId + ", className=" + className + ", sectionName="
				+ sectionName + ", students=" + students + "]";
	}
	
}

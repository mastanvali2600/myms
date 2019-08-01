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
	
	@OneToMany(mappedBy = "id.classInfo")
	private Set<HomeWork> homeWorks;

	
	
	private ClassInfo(String className, String sectionName) {
		super();
		this.classSectionId = createPK(className, sectionName);
		this.className = className;
		this.sectionName = sectionName;
	}
	public static ClassInfo instance(String className, String sectionName) {
		return new ClassInfo(className, sectionName);
	}
	public String getClassSectionId() {
		return classSectionId;
	}

	public String getClassName() {
		return className;
	}
	
	public static String createPK(String className,String sectionName) {
		return className+"-"+sectionName;
	}

	@Override
	public String toString() {
		return "ClassInfo [classSectionId=" + classSectionId + ", className=" + className + ", sectionName="
				+ sectionName + ", students=" + students + "]";
	}
	
}

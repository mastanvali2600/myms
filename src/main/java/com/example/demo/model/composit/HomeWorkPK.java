package com.example.demo.model.composit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.model.ClassInfo;
import com.example.demo.model.Subject;

@Embeddable
public class HomeWorkPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false,updatable = false)
	private Date homeWorkDate;
	
	@ManyToOne
	@JoinColumn(name = "classSectionId")
	private ClassInfo classInfo;
	
	@ManyToOne
	@JoinColumn(name = "subjectId")
	private Subject subject;

	public Date getHomeWorkDate() {
		return homeWorkDate;
	}

	public void setHomeWorkDate(Date homeWorkDate) {
		this.homeWorkDate = homeWorkDate;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "HomeWorkPK [homeWorkDate=" + homeWorkDate + ", classInfo=" + classInfo + ", subject=" + subject + "]";
	}
	
}

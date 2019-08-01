package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Principal {
	@Id
	private String principalJoinId;
	private String name;
	private String email;
	private String phoneNumber;
	private String password;
	@OneToOne
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "schoolId")
	@JsonIdentityReference(alwaysAsId = true)
	private School school;
	@OneToMany(mappedBy = "principal")
	private Set<Faculty> faculties;
	public String getPrincipalJoinId() {
		return principalJoinId;
	}
	public void setPrincipalJoinId(String principalJoinId) {
		this.principalJoinId = principalJoinId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "Principal [principalJoinId=" + principalJoinId + ", name=" + name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + ", school=" + school + ", faculties="
				+ faculties + "]";
	}
	
	
	
		
}

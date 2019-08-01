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

	
	private Principal(String principalJoinId, String name, String email, String phoneNumber, String password,
			School school) {
		super();
		this.principalJoinId = principalJoinId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.school = school;
	}
	
	public static Principal instance(String principalJoinId, String name, String email, String phoneNumber, String password,
			School school) {
		return new Principal(principalJoinId, name, email, phoneNumber, password, school);
	}

	public String getPrincipalJoinId() {
		return principalJoinId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public School getSchool() {
		return school;
	}

	@Override
	public String toString() {
		return "Principal [principalJoinId=" + principalJoinId + ", name=" + name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + ", school=" + school + ", faculties="
				+ faculties + "]";
	}
	
	
	
		
}

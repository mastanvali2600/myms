package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.FilterDef;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@FilterDef(name="facultiesFilter"
, defaultCondition="principalJoinId =(select p.principalJoinId from principal p)")
public class Faculty {

	@Id
	private String facultyId;
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	private String address;
	@ManyToOne
	@JoinColumn(name = "principalJoinId")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "principalJoinId")
	@JsonIdentityReference(alwaysAsId = true)
	private Principal principal;
	
	public Faculty() {
		super();
	}

	private Faculty(String facultyId, String name, String email, String password, String phoneNumber, String address,
			Principal principal) {
		super();
		this.facultyId = facultyId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.principal = principal;
	}

	public static Faculty instance(String facultyId, String name, String email, String password, String phoneNumber, String address,
			Principal principal) {
		return new Faculty(facultyId, name, email, password, phoneNumber, address, principal);
	}

	public String getFacultyId() {
		return facultyId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public Principal getPrincipal() {
		return principal;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", principal=" + principal + "]";
	}
	
}

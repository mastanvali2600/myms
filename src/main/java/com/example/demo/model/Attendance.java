package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.example.demo.model.composit.AttendancePK;

@Entity
public class Attendance {
	@EmbeddedId
	private AttendancePK id;
	
	private boolean isPresent;
	
	private Attendance(AttendancePK id, boolean isPresent) {
		super();
		this.id = id;
		this.isPresent = isPresent;
	}
	
	public static Attendance instance(AttendancePK id, boolean isPresent) {
		return new Attendance(id, isPresent);
	}

	public AttendancePK getId() {
		return id;
	}
	
	public boolean isPresent() {
		return isPresent;
	}
	
	@Override
	public String toString() {
		return "Attendance [attendancePK=" + id + ", isPresent=" + isPresent + "]";
	}
	
	
}

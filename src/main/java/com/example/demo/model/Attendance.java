package com.example.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.example.demo.model.composit.AttendancePK;

@Entity
public class Attendance {
	@EmbeddedId
	private AttendancePK attendancePK;
	
	private boolean isPresent;

	public AttendancePK getAttendancePK() {
		return attendancePK;
	}

	public void setAttendancePK(AttendancePK attendancePK) {
		this.attendancePK = attendancePK;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	@Override
	public String toString() {
		return "Attendance [attendancePK=" + attendancePK + ", isPresent=" + isPresent + "]";
	}
	
	
}

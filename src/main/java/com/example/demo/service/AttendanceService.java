package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Attendance;
import com.example.demo.model.Student;
import com.example.demo.model.Subject;
import com.example.demo.model.composit.AttendancePK;
import com.example.demo.repository.AttendanceRepository;

@Service
public class AttendanceService {
	@Autowired
	private AttendanceRepository attendanceRepository;
	
	public void save(Date date,Student student,Subject subject,boolean isPresent) {
		AttendancePK attendancePK=new AttendancePK();
		attendancePK.setHomeWorkDate(date);
		attendancePK.setStudent(student);
		attendancePK.setSubject(subject);
		
		Attendance attendance=new Attendance();
		attendance.setAttendancePK(attendancePK);
		attendance.setPresent(isPresent);
		
		attendanceRepository.save(attendance);
	}
}

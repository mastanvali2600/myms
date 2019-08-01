package com.example.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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

	public void save(LocalDate date, Student student, Subject subject, boolean isPresent) {
		AttendancePK attendancePK = new AttendancePK();
		attendancePK.setHomeWorkDate(date.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
		attendancePK.setStudent(student);
		attendancePK.setSubject(subject);

		Attendance attendance = new Attendance();
		attendance.setId(attendancePK);;
		attendance.setPresent(isPresent);

		attendanceRepository.save(attendance);
	}

	public List<Attendance> findAll() {
		return attendanceRepository.findAll();
	}
}

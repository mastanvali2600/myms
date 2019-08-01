package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Attendance;
import com.example.demo.model.Student;
import com.example.demo.model.Subject;
import com.example.demo.model.composit.AttendancePK;
import com.example.demo.repository.AttendanceRepository;
import com.example.demo.utils.DateUtils;

@Service
public class AttendanceService {
	@Autowired
	private AttendanceRepository attendanceRepository;

	public void save(LocalDate date, Student student, Subject subject, boolean isPresent) {
		attendanceRepository
				.save(Attendance.instance(AttendancePK.instance(DateUtils.formate(date), student, subject), isPresent));
	}

	public List<Attendance> findAll() {
		return attendanceRepository.findAll();
	}
}

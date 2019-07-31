package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Attendance;
import com.example.demo.model.composit.AttendancePK;

public interface AttendanceRepository extends JpaRepository<Attendance, AttendancePK> {

}

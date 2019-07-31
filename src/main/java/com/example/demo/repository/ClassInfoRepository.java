package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ClassInfo;

public interface ClassInfoRepository extends JpaRepository<ClassInfo, String> {

}

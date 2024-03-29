package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClassInfo;
import com.example.demo.repository.ClassInfoRepository;

@Service
public class ClassInfoService {
	@Autowired
	private ClassInfoRepository classInfoRepository;
	
	public void save(String className,String sectionName) {
		classInfoRepository.save(ClassInfo.instance(className, sectionName));
	}
	
	public List<ClassInfo> findAll(){
		return classInfoRepository.findAll();
	}
	public ClassInfo findOne(String id) {
		return classInfoRepository.findOne(id);
	}
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ClassInfo;
import com.example.demo.repository.ClassInfoRepository;

@Service
public class ClassInfoService {
	@Autowired
	private ClassInfoRepository classInfoRepository;
	
	public void save(String className,String sectionName) {
		ClassInfo classInfo=new ClassInfo();
		classInfo.setClassName(className);
		classInfo.setSectionName(sectionName);
		classInfo.setClassSectionId(classInfo.createPK(className, sectionName));
		classInfoRepository.save(classInfo);
	}
}

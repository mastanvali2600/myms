package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Principal;
import com.example.demo.model.School;
import com.example.demo.repository.PrincipalRepository;

@Service
public class PrincipalService {
	@Autowired
	private PrincipalRepository principalRepository;
	
	public List<Principal> findAll(){
		return principalRepository.findAll();
	}
	
	public void save(String principalJoinId,String name,String email,String password,String phoneNumber,School school) {
		Principal principal=new Principal();
		principal.setPrincipalJoinId(principalJoinId);
		principal.setName(name);
		principal.setEmail(email);
		principal.setPassword(password);
		principal.setPhoneNumber(phoneNumber);
		principal.setSchool(school);
		
		principalRepository.save(principal);
	}
	
	public Principal findOne(String principalJoinId) {
		return principalRepository.findOne(principalJoinId);
	}
}

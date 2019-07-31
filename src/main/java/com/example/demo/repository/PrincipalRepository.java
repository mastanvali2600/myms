package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Principal;

public interface PrincipalRepository extends JpaRepository<Principal, String>{

}

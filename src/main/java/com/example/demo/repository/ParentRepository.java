package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Parent;

public interface ParentRepository extends JpaRepository<Parent, String> {

}

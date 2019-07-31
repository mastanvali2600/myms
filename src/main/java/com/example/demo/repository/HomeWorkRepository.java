package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.HomeWork;
import com.example.demo.model.composit.HomeWorkPK;

public interface HomeWorkRepository extends JpaRepository<HomeWork, HomeWorkPK>{

}

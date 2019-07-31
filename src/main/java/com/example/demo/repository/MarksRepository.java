package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Mark;
import com.example.demo.model.composit.MarkPrimaryKey;

public interface MarksRepository extends JpaRepository<Mark, MarkPrimaryKey>{

}

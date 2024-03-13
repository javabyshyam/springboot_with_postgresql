package com.shyam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}

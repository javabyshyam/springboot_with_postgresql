package com.shyam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.entity.Student;

public interface StudentRespository extends JpaRepository<Student, Long>{

}

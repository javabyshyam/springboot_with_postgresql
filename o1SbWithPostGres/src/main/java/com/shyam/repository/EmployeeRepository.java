package com.shyam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee ,Long>{

}

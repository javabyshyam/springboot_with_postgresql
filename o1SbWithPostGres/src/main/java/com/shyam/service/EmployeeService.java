package com.shyam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shyam.entity.Employee;
import com.shyam.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee saveEmp(Employee employee) {
		return empRepo.save(employee);
	}
	
	public Employee updateEmp(Employee emp) {
		return empRepo.save(emp);
	}
	
	public Employee getById(long id) {
		return empRepo.findById(id).get();
	}
	
	public List<Employee> getAllEMp(){
		return empRepo.findAll();
	}
	
	public void deleteEmp(long id ) {
		empRepo.deleteById(id);
	}
}
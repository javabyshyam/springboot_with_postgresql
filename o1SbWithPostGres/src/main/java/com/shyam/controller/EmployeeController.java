package com.shyam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.shyam.entity.Employee;
import com.shyam.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEMp(@RequestBody Employee employee){
		return new ResponseEntity<>(service.saveEmp(employee),HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> update(@RequestBody Employee employee){
		return ResponseEntity.ok(service.updateEmp(employee));
	}
	
	@GetMapping("/byId/{id}")
	public ResponseEntity<Employee> getById(@PathVariable long id){
		return ResponseEntity.ok(service.getById(id));
	}
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAll(){
		return ResponseEntity.ok(service.getAllEMp());
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable long id){
		service.deleteEmp(id);
		return ResponseEntity.ok("Delete Employee With Id : "+id);
	}
}

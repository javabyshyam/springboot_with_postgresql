package com.shyam.runner;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.entity.Student;
import com.shyam.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {

		Student s=new Student();
		s.setName("Shyam");
		s.setFees(1233.44);
		s.setDoj(new Date());
		
		repo.save(s);
		System.out.println("Record Save Successfully");
		
		Optional<Student> byId = repo.findById((long) 1);
		System.out.println(byId);
	}

}

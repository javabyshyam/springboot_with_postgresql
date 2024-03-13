package com.shyam.runner;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.entity.Student;
import com.shyam.repository.StudentRespository;

@Component
public class StudentRunner implements CommandLineRunner{

	@Autowired
	private StudentRespository repo;
	
	@Override
	public void run(String... args) throws Exception {
Student s=new Student();
s.setName("shyam");
s.setFees(1233.33);
s.setDoj(new Date());

repo.save(s);
System.out.println("Records Got Saved");
		
Optional<Student> byId = repo.findById(1l);

System.out.println(byId.get());
	}

}
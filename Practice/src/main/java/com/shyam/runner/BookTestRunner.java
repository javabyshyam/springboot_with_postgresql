package com.shyam.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.entity.Book;
import com.shyam.repository.BookRepository;

@Component
public class BookTestRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	@Override
	public void run(String... args) throws Exception {

		
		  repo.saveAll(Arrays.asList( new Book(101, "Java", "Shyam",554.55, "Backend"),
		  new Book(102, "Spring", "Sangam",554.55, "Backend"), new Book(103,
		  "Springboot", "Pankaj",584.55, "Backend"), new Book(104, "Angular",
		  "Shilpi",5577.55, "Frontend"), new Book(105, "ReactJS", "Priya",5554.55,
		  "Frontend") ));
		  
		  System.out.println("Record Got Saved Successfully");
		 
	
	repo.findByAuthor("Shyam").forEach(System.out::println);
	}

}

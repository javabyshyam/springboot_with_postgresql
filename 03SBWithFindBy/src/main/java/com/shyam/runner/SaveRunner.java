package com.shyam.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shyam.entity.Book;
import com.shyam.repository.BookRepository;

@Component
public class SaveRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	@Override
	public void run(String... args) throws Exception {

		
		  repo.saveAll(Arrays.asList( new Book(101, "Java", "Shyam", 554.55,
		  "Backend"), new Book(102, "Spring", null, 554.55, "Backend"), new
		  Book(103, "Springboot", "Pankaj", 584.55, "Backend"), new Book(104,
		  "Angular", null, 5577.55, "Frontend"), new Book(105, "ReactJS", "Priya",
		  5554.55, "Frontend")));
		 
	
		/*
		 * List<Book> byAuthor = repo.findByauthorEquals("Shyam");
		 * byAuthor.stream().forEach(System.out::println);
		 */
		
		
		//List<Book> byBookType = repo.findBybookCostGreaterThan(2100.33);
		//byBookType.stream().forEach(System.out::println);

		/*
		 * List<Book> list = repo.findByAuthorContaining("y");
		 * list.stream().forEach(System.out::println);
		 */
		
		/*
		 * List<Book> list = repo.findByAuthorIsNotNull();
		 * list.stream().forEach(System.out::println);
		 */
		  
		/*
		 * List<Book> list = repo.findByAuthorAndBookName("Shyam", "Java");
		 * list.stream().forEach(System.out::println);
		 */
		  List<Book> list = repo.findByAuthorOrBookName("Pankaj", "Java");
		  list.stream().forEach(System.out::println);
		
	}

}

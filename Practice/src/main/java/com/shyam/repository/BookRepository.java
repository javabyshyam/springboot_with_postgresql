package com.shyam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	public List<Book> findByAuthor(String author);
	public List<Book> findByAuthorIs(String author);
	public List<Book> findByAuthorEquals(String author);
	
	
}

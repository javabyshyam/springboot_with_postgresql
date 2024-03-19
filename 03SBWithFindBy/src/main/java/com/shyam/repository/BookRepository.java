package com.shyam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shyam.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	//select * from book where author=:author
	//public List<Book> findByauthor(String author);
	//public List<Book> findByauthorIs(String author);
	public List<Book> findByauthorEquals(String author);
	
	//select * from book where boot_type=:type
	public List<Book> findByBookType(String type);
	
	//select * from book where book_cost=:cost
	public List<Book> findBybookCostEquals(double cost);
	
	public List<Book> findBybookCostLessThan(double cost);
	
	public List<Book> findBybookCostGreaterThan(double cost);
	

	public List<Book> findByAuthorLike(String expresion);
	public List<Book> findByAuthorStartingWith(String expresion);
	public List<Book> findByAuthorEndingWith(String expresion);
	public List<Book> findByAuthorContaining(String expresion);
	
	//select * from book where author is null
	public List<Book> findByAuthorIsNull();
	
	//select * from book where author is not null
	public List<Book> findByAuthorIsNotNull();
	
	//select * from book where author=:? and book_name=:?
	public List<Book> findByAuthorAndBookName(String author,String bookName);
	
	public List<Book> findByAuthorOrBookName(String author,String bookName);

}

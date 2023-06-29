package com.main.sbp.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.sbp.entity.book.Book;
import com.main.sbp.entity.user.User;
import com.main.sbp.repository.book.BookRepository;
import com.main.sbp.repository.user.UserRepository;

@RestController
@RequestMapping("/api")
public class MultipleDBController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/add")
	public ResponseEntity<?> addDataToDB () {
		
		userRepository.saveAll(
				Stream.of(new User(101, "Suraj"), new User(102, "Sharvil"))
				.collect(Collectors.toList()));
		bookRepository.saveAll(
				Stream.of(new Book(201, "Core Java"), new Book(202, "Spring Boot"))
				.collect(Collectors.toList()));
		
		return new ResponseEntity<> ("Data Added Successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>>  getUsers() {
		 List<User> users = userRepository.findAll();
		 return new ResponseEntity<List<User>> (users, HttpStatus.OK);
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>>  getBooks() {
		 List<Book> books = bookRepository.findAll();
		 return new ResponseEntity<List<Book>> (books, HttpStatus.OK);
	}

}

package com.example.mavenBookDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BookController {
	@Autowired
	BookService bookservice;
//	

//	
	
	@RequestMapping("/book")
	public List<Book> getAllBook(){

		return bookservice.getAllBook();
		
	}
//	
	
	@RequestMapping("/book/{id}")
	public Book getBook(@PathVariable String  id) {
		return bookservice.getBook(id);
		
	}
	@RequestMapping(method = RequestMethod.POST, value = "/book")
	public void addBook(@RequestBody Book book ) {
		bookservice.addBook(book);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/book/{id}")
	public void updateTopic(@RequestBody Book book ,@PathVariable String id ) {
		bookservice.updateTopic(book,id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/book/{id}")
	public void updateTopic(@PathVariable String id ) {
		bookservice.delete(id);
	}


}

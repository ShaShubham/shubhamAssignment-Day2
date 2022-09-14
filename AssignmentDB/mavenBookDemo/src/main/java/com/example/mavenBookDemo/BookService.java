package com.example.mavenBookDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
    
	
    public List<Book> getAllBook(){
    	
    
    	List<Book> bookDataList=new ArrayList<>();
    	 bookRepository.findAll().forEach(bookDataList::add);
    	 return bookDataList;
    }

    public Book getBook(String id) {
      
       return bookRepository.findById(id).get();
    }
    public void updateTopic(Book name, String id) {

		bookRepository.save(name);
    }

    public void addBook(Book name) {
        
        bookRepository.save(name);
    }
    public void delete(String id) {

    	bookRepository.deleteById(id);
	}
}

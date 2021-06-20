package com.example.UpdateDelete.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.UpdateDelete.models.Book;
import com.example.UpdateDelete.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

	public void deleteBook(Long id) {

		bookRepository.deleteById(id);
	}
	
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		 if(optionalBook.isPresent()) {
	            Book newBook = optionalBook.get();
	            newBook.setTitle(title);
	            newBook.setDescription(desc);
	            newBook.setLanguage(lang);
	            newBook.setNumberOfPages(numOfPages);
	            bookRepository.save(newBook);
	            return newBook;
	     } 
		 else {
	            return null;
		 }
	}

}
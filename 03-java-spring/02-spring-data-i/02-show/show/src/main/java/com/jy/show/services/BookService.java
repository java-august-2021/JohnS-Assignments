package com.jy.show.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.jy.show.models.Book;
import com.jy.show.repositories.BookRepository;

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
 
 //update book
 
 public Book updateBook(Book b) {
     return bookRepository.save(b);
 }
 
// public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
//     Optional<Book> optionalBook = bookRepository.findById(id);
//     if(optionalBook.isPresent()) {
//    	 Book bookToUpdate = optionalBook.get();
//    	 bookToUpdate.setTitle(title);
//    	 bookToUpdate.setDescription(desc);
//    	 bookToUpdate.setLanguage(lang);
//    	 bookToUpdate.setNumberOfPages(numOfPages);
//    	 
//    	 return bookRepository.save(bookToUpdate);
//     } else {
//         return null;
//     }
// }
// 
 //delete a book by id
 public void deleteBook(Long id) {
	 bookRepository.deleteById(id);
 }
}


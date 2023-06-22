package com.bookstore.bookstore.service.Impl;

import com.bookstore.bookstore.Model.Book;
import com.bookstore.bookstore.repository.BookRepository;
import com.bookstore.bookstore.service.IBookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookService implements IBookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Optional<Book> findBookById(Integer bookId) {
        return bookRepository.findById(bookId);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}

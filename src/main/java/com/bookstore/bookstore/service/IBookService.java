package com.bookstore.bookstore.service;

import com.bookstore.bookstore.Model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    public Optional<Book> findBookById(Integer bookId);
    public List<Book> getAllBooks();

}

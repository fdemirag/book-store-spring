package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer> {
}

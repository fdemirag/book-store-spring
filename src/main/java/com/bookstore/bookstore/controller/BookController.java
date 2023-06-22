package com.bookstore.bookstore.controller;

import com.bookstore.bookstore.Model.Book;
import com.bookstore.bookstore.Model.Order;
import com.bookstore.bookstore.dto.BookDto;
import com.bookstore.bookstore.service.Impl.BookService;
import com.bookstore.bookstore.service.Impl.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookview/")
public class BookController {

    private final OrderService orderService;
    private final BookService bookService;

    public BookController(BookService bookService, OrderService orderService) {
        this.bookService = bookService;
        this.orderService = orderService;
    }

    @GetMapping("books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> bookList = bookService.getAllBooks();
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orderList = orderService.getAllOrders();
        return ResponseEntity.ok(orderList);
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookDto bookDto) {
        Order order = orderService.putAnOrder(bookDto.getBookIdList(), bookDto.getUserName());

        return ResponseEntity.ok(order);
    }
}

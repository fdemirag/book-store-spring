package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}

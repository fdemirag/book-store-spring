package com.bookstore.bookstore.service;

import com.bookstore.bookstore.Model.Order;

import java.util.List;

public interface IOrderService {

    public Order putAnOrder(List<Integer> bookIdList, String userName);
    public List<Order> getAllOrders();
}

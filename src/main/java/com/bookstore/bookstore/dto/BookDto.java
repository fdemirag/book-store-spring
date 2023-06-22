package com.bookstore.bookstore.dto;

import lombok.Data;

import java.util.List;

@Data
public class BookDto {

    private List<Integer> bookIdList;
    private String userName;
}

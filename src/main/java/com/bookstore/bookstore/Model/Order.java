package com.bookstore.bookstore.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table
@Entity(name = "bookOrder")
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;

    @Column
    @ElementCollection(targetClass=Integer.class)
    private List<Integer>bookIdList;

    private Double totalPrice;
}

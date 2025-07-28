package ru.netology.netspringjdbc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Orders {

    @Id
    @GeneratedValue
    private int id;

    private String date;

    @Column(name = "product_name")
    private String productName;
    private int amount;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;
}

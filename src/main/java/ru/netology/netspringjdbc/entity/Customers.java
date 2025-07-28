package ru.netology.netspringjdbc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customers {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String surname;
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

}

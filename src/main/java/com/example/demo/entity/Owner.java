package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30, nullable = false)
    private String firstName;

    @Column(length = 30, nullable = false)
    private String lastName;

    private String address;

    private String city;

    @Column(length = 20)
    private String telephone;

}
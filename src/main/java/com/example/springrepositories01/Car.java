package com.example.springrepositories01;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private long serialNumber;
    private double currentPrice;
}

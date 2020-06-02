package com.epam.demoapi.smallshop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
class Product implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private int price;

    Product() {
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}


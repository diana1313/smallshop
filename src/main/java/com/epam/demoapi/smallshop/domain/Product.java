package com.epam.demoapi.smallshop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
class Product implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private BigDecimal price;

    Product() {
    }

    Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}


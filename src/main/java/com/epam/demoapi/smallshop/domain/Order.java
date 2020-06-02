package com.epam.demoapi.smallshop.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @CollectionTable
    //Not sure about mapping - but seem to be correct :D
    private List<Product> produts;

    @Column
    private int totalPrice;

    public Order(Integer id, List<Product> produts) {
        this.id = id;
        this.produts = produts;
    }

    public int countTotalPrice(List <Product> products){
        // Have no idea where to put quantity of products ???
        // Therefore no way to count the total price ¯\_(ツ)_/¯
        return 0;
    }
}

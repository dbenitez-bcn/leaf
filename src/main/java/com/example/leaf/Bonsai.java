package com.example.leaf;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bonsais")
public class Bonsai {
    @Id
    Long id;
    String name;
    double price;
    boolean sold;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSold() {
        return sold;
    }
}

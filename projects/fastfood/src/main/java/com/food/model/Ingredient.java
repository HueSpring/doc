package com.food.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Hue on 11/4/2016.
 */
@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private int price;

    public Ingredient() {
    }

    public Ingredient(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}

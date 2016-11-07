package com.demo.model;

import javax.persistence.*;

/**
 * Created by Hue on 10/22/2016.
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private String productId;
    private String productName;
    private Catalog cateId;
    private float totalMoney;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Catalog getCateId() {
        return cateId;
    }

    public void setCateId(Catalog cateId) {
        this.cateId = cateId;
    }

}

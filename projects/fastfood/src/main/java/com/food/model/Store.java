package com.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Hue on 10/31/2016.
 */
@Entity
@Table(name = "store")
public class Store {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private int no;
    private String street;
    private String district;
    private String province;
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<User> users;

    @OneToMany(mappedBy = "store")
    @JsonIgnore
    private Set<StoreIngredient> storeIngredients;

    public Store() {
    }

    public Store(String id, String name, int no, String street, String district, String province) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.street = street;
        this.district = district;
        this.province = province;
    }

    public Store(String id, String name, int no, String street, String district, String province, Set<User> users) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.street = street;
        this.district = district;
        this.province = province;
        this.users = users;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<StoreIngredient> getStoreIngredients() {
        return storeIngredients;
    }

    public void setStoreIngredients(Set<StoreIngredient> storeIngredients) {
        this.storeIngredients = storeIngredients;
    }
}

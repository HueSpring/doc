package com.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Hue on 10/31/2016.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private String id;
    @JsonIgnore
    private String password;
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private String phone;
    private String email;
    private boolean active;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Salary> salaries;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<ImportStoreIngredient> importStoreIngredients;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Order> orders;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<RequireIngredient> requireIngredients;


    public User() {
    }

    public User(String password, String firstName, String lastName, String dob, String address,
                String phone, String email, boolean active) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(Set<Salary> salaries) {
        this.salaries = salaries;
    }

    public Set<ImportStoreIngredient> getImportStoreIngredients() {
        return importStoreIngredients;
    }

    public void setImportStoreIngredients(Set<ImportStoreIngredient> importStoreIngredients) {
        this.importStoreIngredients = importStoreIngredients;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<RequireIngredient> getRequireIngredients() {
        return requireIngredients;
    }

    public void setRequireIngredients(Set<RequireIngredient> requireIngredients) {
        this.requireIngredients = requireIngredients;
    }
}

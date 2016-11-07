package com.demo.model;

/**
 * Created by NTXHue on 10/13/2016.
 */

import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_id;
    private String firstName;
    private String lastName;
    private String address;
    private String numberPhone;
    private String email;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address, String numberPhone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                customer_id, firstName, lastName);
    }

}
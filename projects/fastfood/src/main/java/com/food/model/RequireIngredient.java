package com.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Hue on 11/3/2016.
 */
@Entity
@Table(name = "require_ingredient")
public class RequireIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description;
    private boolean status;
    private boolean statusInspection;
    private boolean statusSuccess;
    private int quantity;
    private String note;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;


    public RequireIngredient() {
    }

    public RequireIngredient(String description, boolean status, boolean statusInspection, boolean statusSuccess, int quantity, String note) {
        this.description = description;
        this.status = status;
        this.statusInspection = statusInspection;
        this.statusSuccess = statusSuccess;
        this.quantity = quantity;
        this.note = note;
    }

    public RequireIngredient(String description, boolean status, boolean statusInspection, boolean statusSuccess, int quantity, String note, User user) {
        this.description = description;
        this.status = status;
        this.statusInspection = statusInspection;
        this.statusSuccess = statusSuccess;
        this.quantity = quantity;
        this.note = note;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatusInspection() {
        return statusInspection;
    }

    public void setStatusInspection(boolean statusInspection) {
        this.statusInspection = statusInspection;
    }

    public boolean isStatusSuccess() {
        return statusSuccess;
    }

    public void setStatusSuccess(boolean statusSuccess) {
        this.statusSuccess = statusSuccess;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

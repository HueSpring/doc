package com.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Hue on 11/3/2016.
 */
@Entity
@Table(name = "import_store_ingredient")
public class ImportStoreIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String dateImport;
    private String dateEnd;
    private int quantity;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "store_ingredient_id")
    private StoreIngredient storeIngredient;

    public ImportStoreIngredient(String dateImport, String dateEnd, int quantity, StoreIngredient storeIngredient) {
        this.dateImport = dateImport;
        this.dateEnd = dateEnd;
        this.quantity = quantity;
        this.storeIngredient = storeIngredient;
    }

    public ImportStoreIngredient(String dateImport, String dateEnd, int quantity, User user) {
        this.dateImport = dateImport;
        this.dateEnd = dateEnd;
        this.quantity = quantity;
        this.user = user;
    }

    public ImportStoreIngredient(String dateImport, String dateEnd, int quantity, User user, StoreIngredient storeIngredient) {
        this.dateImport = dateImport;
        this.dateEnd = dateEnd;
        this.quantity = quantity;
        this.user = user;
        this.storeIngredient = storeIngredient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateImport() {
        return dateImport;
    }

    public void setDateImport(String dateImport) {
        this.dateImport = dateImport;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public StoreIngredient getStoreIngredient() {
        return storeIngredient;
    }

    public void setStoreIngredient(StoreIngredient storeIngredient) {
        this.storeIngredient = storeIngredient;
    }
}

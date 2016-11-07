package com.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Hue on 11/3/2016.
 */
@Entity
@Table(name = "store_ingredient")
public class StoreIngredient {

    @Id
    @GeneratedValue
    private String id;
    private int quantity;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "store_id")
    private Store store;

    @OneToMany(mappedBy = "storeIngredient")
    @JsonIgnore
    private Set<ImportStoreIngredient> importStoreIngredients;

    public StoreIngredient() {
    }

    public StoreIngredient(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Set<ImportStoreIngredient> getImportStoreIngredients() {
        return importStoreIngredients;
    }

    public void setImportStoreIngredients(Set<ImportStoreIngredient> importStoreIngredients) {
        this.importStoreIngredients = importStoreIngredients;
    }
}

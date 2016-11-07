package com.food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Hue on 11/4/2016.
 */
@Entity
@Table(name = "unit_type")
public class UnitType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ingredientUnit;
    private String foodIngredientUnit;
    private String storeIngredientUnit;
    private int foodIngredientValue;
    private int storeIngredientValue;

    @ManyToOne
    @JoinColumn(name = "store_ingredient_id")
    @JsonIgnore
    private StoreIngredient storeIngredient;





    public UnitType() {
    }

    public UnitType(String ingredientUnit, String foodIngredientUnit, String storeIngredientUnit, int foodIngredientValue, int storeIngredientValue) {
        this.ingredientUnit = ingredientUnit;
        this.foodIngredientUnit = foodIngredientUnit;
        this.storeIngredientUnit = storeIngredientUnit;
        this.foodIngredientValue = foodIngredientValue;
        this.storeIngredientValue = storeIngredientValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngredientUnit() {
        return ingredientUnit;
    }

    public void setIngredientUnit(String ingredientUnit) {
        this.ingredientUnit = ingredientUnit;
    }

    public String getFoodIngredientUnit() {
        return foodIngredientUnit;
    }

    public void setFoodIngredientUnit(String foodIngredientUnit) {
        this.foodIngredientUnit = foodIngredientUnit;
    }

    public String getStoreIngredientUnit() {
        return storeIngredientUnit;
    }

    public void setStoreIngredientUnit(String storeIngredientUnit) {
        this.storeIngredientUnit = storeIngredientUnit;
    }

    public int getFoodIngredientValue() {
        return foodIngredientValue;
    }

    public void setFoodIngredientValue(int foodIngredientValue) {
        this.foodIngredientValue = foodIngredientValue;
    }

    public int getStoreIngredientValue() {
        return storeIngredientValue;
    }

    public void setStoreIngredientValue(int storeIngredientValue) {
        this.storeIngredientValue = storeIngredientValue;
    }

    public StoreIngredient getStoreIngredient() {
        return storeIngredient;
    }

    public void setStoreIngredient(StoreIngredient storeIngredient) {
        this.storeIngredient = storeIngredient;
    }
}

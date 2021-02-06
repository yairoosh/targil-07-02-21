package com.company;

import java.util.HashMap;

public class Dish {
    private String dishID;
    private String dishName;
    private HashMap<String, Double> ingreidients;
    private int dishPrice;

public Dish(String dishID, String dishName, int dishPrice) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        ingreidients = new HashMap<String, Double>();
    }

public String getDishID()
    { return dishID; }
public String getDishName()
    { return dishName; }
public HashMap<String, Double> getIngredients()
    { return ingreidients; }
public int getDishPrice()
    { return dishPrice; }

public void setDishID(String dishID) {
        this.dishID = dishID;
    }
public void setDishName(String dishName) {
        this.dishName = dishName;
    }
public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }
public void setIngreidients(HashMap<String, Double> ingreidients) {
        this.ingreidients = ingreidients;
    }
}

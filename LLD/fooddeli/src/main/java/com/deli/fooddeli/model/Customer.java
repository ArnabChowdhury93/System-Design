package com.deli.fooddeli.model;

import java.util.List;

public abstract class Customer {
   protected Cart cart;

    int customerID;

    public Cart getFoodCart(){
       return  Cart.getInstance();
    }

    public boolean addFoodItem(FoodItem item){
        cart.addItem(item);

    }

    public boolean removeFoodItem(FoodItem item){
        cart.deleteItem(item);
    }
}
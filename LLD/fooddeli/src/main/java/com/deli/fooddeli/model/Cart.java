package com.deli.fooddeli.model;

import java.util.ArrayList;
import java.util.List;

import main.java.com.deli.fooddeli.model.Order;
import main.java.com.deli.fooddeli.model.Payment;


public  class Cart {

    private static Cart cart;
    private Cart(){
    }
    public static Cart getInstance(){
        if(cart==null){
            return new Cart();
        }
        else {
            return cart;
        }
    }

    List<FoodItem> items = new ArrayList<>();

    public boolean addItem(Product item){
   
    }

    public boolean deleteItem(Product item){

    }

    public boolean updateItem(Product item, int quantity){

    }

    public boolean updateItemQuantity(int newQuantity){

    }

    public List<Product> getItems(){

    }

    public boolean checkout(Order order){
        Payment payment = new Payment();
        return order.makePayment(payment);
    }
}

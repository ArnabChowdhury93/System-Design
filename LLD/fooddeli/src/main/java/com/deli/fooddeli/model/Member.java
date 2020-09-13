package com.deli.fooddeli.model;

import main.java.com.deli.fooddeli.model.Order;

public class Member extends Customer {
    private Account account;
    private Order order;
    private List<NotificationType> notifications;

    public Member(){
        cart = getFoodCart();
    }

    public boolean placeOrder(){
        order= new Order();
        order.setItems(cart.getItems());
        return cart.checkout(order); 
    }
    

    
    
}

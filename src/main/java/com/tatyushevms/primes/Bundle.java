package com.tatyushevms.primes;

public class Bundle {
    
    private final int quantity;
    private final int cost;
    private final double price;
    
    public Bundle(int quantity, int cost) {
        this.quantity = quantity;
        this.cost = cost;
        this.price = (double) cost / quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public int getCost() {
        return cost;
    }
    
    public double getPrice() {
        return price;
    }
    
}

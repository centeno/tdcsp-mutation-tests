package com.latam.mutation.example.tdc;

public class Product {
    public int getPrice(int amount, boolean coupom) {
        if(amount >= 20 || coupom){
            return 15 * amount;
        }
        return 17 * amount;
    }
}

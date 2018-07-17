package com.latam.mutation.example.one;

public class Product {
    public int getUnitPrice(int amount, boolean coupon) {
        if(amount >= 20 || coupon ){
            return 17;
        }
        return 20;
    }
}

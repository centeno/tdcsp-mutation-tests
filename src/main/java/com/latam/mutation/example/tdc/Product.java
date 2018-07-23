package com.latam.mutation.example.tdc;

public class Product {
    public int getPrice(int amount, boolean coupon) {
        if(amount >= 20 || coupon){
            return amount * 15;
        }
        return 17 * amount;
    }
}

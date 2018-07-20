package com.latam.mutation.example.tdc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutoTest {

    @Test
    public void shouldReturnNormalPrice() {
        Product product = new Product();
        int amount = 2;
        int price = product.getPrice(amount,false);
        assertEquals(34,price);
    }

    @Test
    public void shouldReturnPriceByAmount() {
        Product product = new Product();
        int amount = 100;
        int price = product.getPrice(amount,false);
        assertEquals(1500,price);
    }

    @Test
    public void shouldReturnPriceByCoupon() {
        Product product = new Product();
        int amount = 10;
        int price = product.getPrice(amount,true);
        assertEquals(150,price);
    }

    @Test
    public void shouldReturnPriceByAmountEqual20() {
        Product product = new Product();
        int amount = 20;
        int price = product.getPrice(amount,false);
        assertEquals(300,price);
    }


}

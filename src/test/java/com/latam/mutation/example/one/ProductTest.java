package com.latam.mutation.example.one;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {


    @Test
    public void testNormalPricing() {
        Product product = new Product();
        int amount = 1;
        Assert.assertEquals(20,product.getUnitPrice(amount,false));
    }

    @Test
    public void testWithCouponPricing() {
        Product product = new Product();
        int amount = 1;
        Assert.assertEquals(17,product.getUnitPrice(amount,true));
    }

    @Test
    public void testWhenAmountIsGreaterThan20() {
        Product product = new Product();
        int amount = 21;
        Assert.assertEquals(17,product.getUnitPrice(amount,false));
    }

    /*
    @Test
    public void testWhenAmountIsEqualTo20() {
        Product product = new Product();
        int amount = 20;
        Assert.assertEquals(17,product.getUnitPrice(amount,false));
    }
    */
}

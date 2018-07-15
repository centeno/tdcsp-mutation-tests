package com.latam.mutation.ExampleApp;

import com.latam.mutation.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest {


    @Test
    public void testNormalPricing() {
        Product product = new Product();
        int amount = 1;
        Assert.assertEquals(20,product.getUnitPrice(amount,false));
    }

}

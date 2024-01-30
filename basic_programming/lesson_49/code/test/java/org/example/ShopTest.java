package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ShopTest {
    private Shop shop;
    @BeforeEach
    public void setUp(){
        this.shop = new Shop("Shop name");
    }
    @Test
    public void getTitle(){
        Assertions.assertEquals("Shop name", this.shop.getTitle());
    }
    @Test
    public void getProducts(){
        Product product1 = new Product("Product1", 10, 4);
        Product product2 = new Product("Product2", 20, 6);

        this.shop.add(product1);
        this.shop.add(product2);
        ArrayList<Product> products = this.shop.getProducts();

        Assertions.assertTrue(products.contains(product1));
        Assertions.assertTrue(products.contains(product2));
        Assertions.assertEquals(2, products.size());
    }
    @Test
    public void addProduct(){
        Product product = new Product("Product1", 10, 12);
        this.shop.add(product);
        Assertions.assertTrue(this.shop.getProducts().contains(product));
    }


    @ParameterizedTest
    @CsvSource({"1_2_4_2,9", "1_1_1_1,4"})
    public void productsCount(String counts, int result){
        Arrays.stream(counts.split("_"))
                .mapToInt(x -> Integer.parseInt(x))
                .forEach(x -> this.shop.add(new Product("title", 123, x)));

        Assertions.assertEquals(result, this.shop.productsCount());
    }

}





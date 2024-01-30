package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProductTest {

    @Test
    public void productCreationPositive(){
        String title = "велосипед";
        double price = 2300;
        int count = 10;
        Product product = new Product(title, price, count);
        Assertions.assertEquals(title, product.getTitle());
        Assertions.assertEquals(price, product.getPrice());
        Assertions.assertEquals(count, product.getCount());
    }

    @Test
    public void notPositivePrice(){
        String title = "велосипед";
        double price = -2300;
        int count = 10;
        Assertions.assertThrows(RuntimeException.class, () -> {
            new Product(title, price, count);
        });
    }

    @Test
    public void notPositiveCount(){
        String title = "велосипед";
        double price = 2300;
        int count = -10;
        Assertions.assertThrows(RuntimeException.class, () -> {
            new Product(title, price, count);
        });
    }

    @Test
    public void setProductPricePositive(){
        String title = "велосипед";
        double price = 2300;
        double newPrice = 2500;
        int count = 10;
        Product product = new Product(title, price, count);
        product.setPrice(newPrice);
        Assertions.assertEquals(newPrice, product.getPrice());
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1000, -1, 0})
    public void setProductPriceNegative(double newPrice){
        String title = "велосипед";
        double price = 2300;
        int count = 10;
        Product product = new Product(title, price, count);
        product.setPrice(newPrice);
        Assertions.assertEquals(price, product.getPrice());
    }


}

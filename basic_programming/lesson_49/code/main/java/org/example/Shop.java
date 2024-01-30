package org.example;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;

public class Shop {

    private String title;
    private ArrayList<Product> products;

    public Shop(String title) {
        this.title = title;
        this.products = new ArrayList<>();
    }

    public void add(Product product){
        this.products.add(product);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


    public int productsCount(){
        OptionalInt result = this.products.stream()
                .mapToInt(x -> x.getCount())
                .reduce((acc, item) -> acc + item);

        return result.isPresent() ? result.getAsInt(): 0;
    }

// добавить метод  productsCount, который возвращает кол-во всех продуктов
//    написать для него тест
}

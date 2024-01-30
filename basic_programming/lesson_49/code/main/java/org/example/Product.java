package org.example;

public class Product {

    private String title;
    private double price;
    private int count;

    public Product(String title, double price, int count) {
        this.title = title;
        if (price > 0){
            this.price = price;
        }else{
            throw new RuntimeException("You have set not positive price");
        }

        if (count > 0){
            this.count = count;
        }else{
            throw new RuntimeException("You have set not positive count");
        }
    }

    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }

    public void setPrice(double newPrice){
        if (newPrice > 0){
            this.price = newPrice;
        }
    }

}

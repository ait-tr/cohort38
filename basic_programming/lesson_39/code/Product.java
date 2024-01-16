public class Product {
    private String name;
    private Integer count;
    private Integer price;

    public Product(String name, Integer count, Integer price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }
    public Integer getCount() {
        return count;
    }
    public Integer getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}

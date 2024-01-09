public class Product implements Info {
    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String info(String pref) {
        return String.format("%s %s (%d)", pref, this.title, this.price);
    }
}

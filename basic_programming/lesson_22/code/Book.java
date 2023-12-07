package inheritance;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String title, String author){
        this(title, author, 0);
    }

    public Book(String title){
        this(title, "Unknown");
    }

}
/*

    Book("Старик и море", "Unknown")
    Book("Старик и море", "Unknown", 0)


 */
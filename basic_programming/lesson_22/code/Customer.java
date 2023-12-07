package inheritance;

public class Customer extends Human{

    public double avgOrderSum;
    public Customer(String firstName, String lastName, double avgOrderSum){
        super(firstName, lastName);
        this.avgOrderSum = avgOrderSum;
    }
}

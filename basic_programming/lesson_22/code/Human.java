package inheritance;

public class Human {
    public String firstName;
    public String lastName;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String info(){
        return String.format(
                "name: %s lastname: %s%n",
                this.firstName,
                this.lastName
        );
    }
}

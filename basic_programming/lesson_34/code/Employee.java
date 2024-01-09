public class Employee implements Info{
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String info(String pref){
        return String.format("%s %s %s", pref, this.firstName, this.lastName);
    }
}

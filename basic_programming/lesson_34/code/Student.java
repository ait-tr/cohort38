public class Student implements Info {
    public String firstName;
    public String lastName;
    public double avgGrade;

    public Student(String firstName, String lastName, double avgGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avgGrade = avgGrade;
    }

    @Override
    public String info(String pref) {
        return String.format("%s %s %s %.2f", pref, this.firstName, this.lastName, this.avgGrade);
    }
}

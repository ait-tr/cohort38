public class Student {
    private String name;
    private Integer age;
    private double grade;

    public Student(String name, Integer age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double grade(){
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f)", this.name, this.grade);
    }
}

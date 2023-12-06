package overload;

public class User {
    private String name;
    public String type;
    public int age;

    public User(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public User(String name, int age){
        this(name, age, "customer");
    }

    public User(int age){
        this("Unknown", age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        setName("Unknown");
    }

    //    описать два конструктора
//    в первом случае конструктор получает оба аргумента
//    во втором только возраст, в качестве name присваивается значение "Unknown"


}


// добавить свойство type
// добавить еще один конструктор, в котором
// указывается в параметрах 3 значения + type
// если type не указан, должен подставляться
// "customer"

// сделать name приватным и добавить ему getter
// и setter
// setter может не принимать аргументов и в
// таком случае должен присвоить значение "Unknown"
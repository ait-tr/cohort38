package inheritance_2;

public class Animal {

    public String name;
    public String type;
    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void run(){
        System.out.println("тыг-дыг тыг-дыг");
    }
    public void sound(){
        System.out.println("* невоспроизводимые животные звуки *");
    }
}

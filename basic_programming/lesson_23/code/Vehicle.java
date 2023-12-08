package inheritance_2;

public class Vehicle {
    public String model;
    public double weight;

    public Vehicle(String model, double weight){
        this.model = model;
        this.weight = weight;
    }

    public void start(){
        System.out.println("start");
    }
    public void stop(){
        System.out.println("stop");
    }
}

// добавить свойство weight (double) в класс Vehicle
// в классе Car получать значение веса в конструкторе и передавать его в
// родительский конструктор
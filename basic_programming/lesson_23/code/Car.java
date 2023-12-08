package inheritance_2;

public class Car extends Vehicle{
    public int maxSpeed;
    public Car(String model, double weight, int maxSpeed){
        super(model, weight);
        this.maxSpeed = maxSpeed;
    }
    public Car(String model){
        this(model, 0, 0);
    }
    public Car(){
        this("Unknown");
    }
}

// добавиь в Car конструктор, который не получает
// аргументов
// в таком случае модель машины должна быть "Unknown"


// добавить конструктор Car который получает один
// аргумент model
// в качестве weight указывается 0
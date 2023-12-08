package inheritance_2;

public class Dog extends Animal{
    public int energy;
    public Dog(String name, String type, int energy){
        super(name, type);
        this.energy = energy;
    }
    public void eat(){
        this.energy += 10;
    }
    @Override
    public void run(){
        super.run();
        this.energy -= 10;
    }

    @Override
    public String toString(){
        return String.format("%s (%s)%n", this.name, this.type);
    }
}



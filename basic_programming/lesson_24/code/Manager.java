package inheritance_2;

public class Manager extends Employee{
    private int level;

    public Manager(String name, double salary, int level){
        super(name, salary);
//        this.level = level;
        setLevel(level);
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        if (level >= 1 && level <= 10){
            this.level = level;
        }else{
            System.out.println("Вы указали неверный уровень");
        }
    }
}

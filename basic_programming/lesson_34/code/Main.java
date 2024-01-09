import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Info[] obj = new Info[4];
//        obj[0] = new Employee("Анатолий", "Ушанов");
//        obj[1] = new Product("Фен", 200);
//        obj[2] = new Employee("Антон", "Куликов");
//        obj[3] = new Student("Антон", "Гвоздев", 4.5);
//
//        for (Info elem: obj) {
//            System.out.println(elem.info("Pref: "));
//        }

//        создать массив из 6 различных фигур
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(6);
        shapes[1] = new Circle(16);
        shapes[2] = new Square(6);
        shapes[3] = new Square(16);
        shapes[4] = new Rectangle(6, 16);
        shapes[5] = new Rectangle(8, 18);


//        написать процесс, который находит самую большую площадь фигуры
        Shape result = shapes[0];
        for (Shape shape: shapes) {
            if (result.getArea() < shape.getArea()){
                result = shape;
            }
        }
        System.out.println(result.getClass());
    }
}
/*
создать классы, которые имплементируют Shape

Square со свойствами side
Circle со свойством radius
Rectangle со свойствами  sideA и sideB
 */
package overload;

public class AreaCalculator {

    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double rectangleArea(double base, double height){
        return base * height;
    }

    public static double triangleArea(double base, double height){
        return base * height / 2;
    }

    public static double triangleArea1(double side1, double side2, double side3){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

}

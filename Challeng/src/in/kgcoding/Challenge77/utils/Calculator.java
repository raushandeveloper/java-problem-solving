package in.kgcoding.Challenge77.utils;

import in.kgcoding.Challenge77.utils.geometry.Circle;
import in.kgcoding.Challenge77.utils.geometry.Rectangle;

public class Calculator {
    static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius ,2);
        double rectArea = rect.breadth * rect.length;

        System.out.printf("Area of the circle is: %f, Area of the rectangle of %f:",cirArea,rectArea);
    }
}

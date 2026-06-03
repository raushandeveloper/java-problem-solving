package com.encapsulation1.utils;

import com.encapsulation1.geometry.Circle;
import com.encapsulation1.geometry.Rectangle;

public class Calculator {
    static void main() {
        Circle cir = new Circle(5.5);
        Rectangle rec = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double rectArea = rec.length * rec.breadth;
        System.out.printf("Area of the circle is: %f \nArea of the rectangle is: %f",cirArea,rectArea);
    }
}

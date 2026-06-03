package Encapsulation.kgcoding.knowledgeGate;

import Encapsulation.kgcoding.gatterSetter.Car;

public class GetterTest {
    static void main() {
        Car car = new Car("Red","Mauruti",
                3,8000);
        System.out.println(car);
        System.out.printf("%s %s",car.getColor(),car.getModel());
        car.setColor("Pink");
        System.out.printf("%s %s",car.getColor(),car.getModel());
    }
}

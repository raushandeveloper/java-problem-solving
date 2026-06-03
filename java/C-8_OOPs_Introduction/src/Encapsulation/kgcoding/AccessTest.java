package Encapsulation.kgcoding;

public class AccessTest {
    static void main() {
        Car car = new Car();
        car.color = "Red";
        car.model = "Swoft";
        System.out.println(car);
//        car.costOfPurchase = 7565;
        Car newcar = new Car("Black","BMW",1,50000);
        System.out.println(newcar);
    }
}

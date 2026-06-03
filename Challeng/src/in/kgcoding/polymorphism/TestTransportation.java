package in.kgcoding.polymorphism;

public class TestTransportation {
    static void main(String[] args) {
         Car c = new Car();
//         Vehicle v = new Vehicle();
         Vehicle vCar = new Car();
         Plane p = new Plane();

         c.start();
         p.start();

//         castTest(v);
//         castTest(c);
//         castTest(p);
//         Car cVehicle = (Car) new Vehicle();
    }
    private static void castTest(Vehicle veh){
//        Car cVehicle = (Car) veh;
//        ((Car) veh).noOfDoors();
//        cVehicle.start();
        veh.start();
    }
}

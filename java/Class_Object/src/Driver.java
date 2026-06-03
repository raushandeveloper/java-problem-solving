public class Driver {
    String name;
    String dateOfLicense;
    int age;

    static int minAgeForDriving = 18;   // static

    public boolean isAllowedToDrive(){   //not static
        return this.age >= minAgeForDriving;
    }
    static void main() {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelInLiters());

        Car swift = new Car("red");   //Parameterized constructor
        Car thar = new Car();   //Parameterized constructor
//        swift.addFuel;
        Car startedSwift = swift.start();
        startedSwift.drive();
        System.out.println("Swift car color: "+swift.color);

        Car startedThar = thar.start();
        startedThar.drive();
        System.out.println("Thar car color: "+thar.color);

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/Jan/2025";

//        System.out.println(minAgeForDriving);

    }
}

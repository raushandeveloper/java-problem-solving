public class Car {
//   Instance Property
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

//    Constructors
    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }
    Car() {
        this("Black"); // default color
        currentFuelInLiters = 6;
    }

//   Instance Method
    public Car start(){
        if(currentFuelInLiters ==0 ){
            System.out.println("Car is out if fuel, can not start");
        }else if(currentFuelInLiters < 5){
            System.out.println("Car is in reserved mode, Please refuel");
        }else{
            System.out.println("Car is started.. bruhhhh......");
        }
        return this;
    }


    public void drive(){
        currentFuelInLiters--;
        System.out.println("Car is driving.");
    }
    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }
    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}

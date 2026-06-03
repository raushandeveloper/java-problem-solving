package Encapsulation.kgcoding;

public class Car {
    public String color;
    public String model;
    private int fuelLevel;
    private long costOfPurchase;

    public Car(){

    }

    public Car(String color, String model, int fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }

}

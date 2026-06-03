package Encapsulation.kgcoding.gatterSetter;

public class Car {
    private String color;   //public
    private String model;   //public
    private int fuelLevel;
    private long costOfPurchase;  //default

    public Car(String color, String model, int fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        if(color.equals("yellow")){
            System.out.println("Change the color");
        }else{
            this.color = color;
        }
    }

    public String getModel() {
        return model;
    }
}

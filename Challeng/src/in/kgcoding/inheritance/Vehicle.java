package in.kgcoding.inheritance;

public class Vehicle {
    private int numberOfTires;

    public void setNumberOfTires(int numberOfTires){
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfTires=" + numberOfTires +
                '}';
    }

    public void commute(){
        System.out.println("I am going from place A to place B using "+numberOfTires+" tires");
    }
}

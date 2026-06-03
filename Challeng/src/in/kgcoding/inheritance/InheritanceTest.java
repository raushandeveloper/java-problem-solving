package in.kgcoding.inheritance;

public class InheritanceTest {
    static void main() {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler Two = new TwoWheeler();
        Two.commute();
        Two.balance();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}

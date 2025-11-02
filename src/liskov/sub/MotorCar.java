package liskov.sub;

public class MotorCar implements MotorVehicle {


    @Override
    public void hasWheels() {
        System.out.println("Car has 4 wheels");
    }

    @Override
    public void hasEngine() {
        System.out.println("Car has an engine");
    }
}

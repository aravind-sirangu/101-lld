package solid.liskov.sub;

public class Cycle implements GoodVehicle {

    @Override
    public void hasWheels() {
        System.out.println("Cycle has 2 wheels");
    }
}

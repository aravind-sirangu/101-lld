package liskov;

public class Car implements Vehicle{
    @Override
    public void hasWheels() {
        System.out.println("Car has 4 wheels");
    }

    @Override
    public void hasEngine() {
        System.out.println("Car has an engine");
    }
}

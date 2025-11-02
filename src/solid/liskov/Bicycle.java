package solid.liskov;

public class Bicycle implements Vehicle{
    @Override
    public void hasWheels() {
        System.out.println("Bicycle has wheels");
    }

    @Override
    public void hasEngine() {
        throw new AssertionError("Bicycle doesn't have wheels");
    }
}

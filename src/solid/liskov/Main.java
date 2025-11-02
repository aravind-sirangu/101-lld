package solid.liskov;

import solid.liskov.sub.Cycle;
import solid.liskov.sub.GoodVehicle;
import solid.liskov.sub.MotorCar;
import solid.liskov.sub.MotorVehicle;

public class Main {
    /*
        Liskov substitution says that the class can be replaced with any of the any other child class
        of the same parent without breaking
     */
    public static void main(String[] args) {
        System.out.println("**** Corrected Version ***");
        correct();
        System.out.println("**** Uncorrected Version ***");
        uncorrected();
    }

    public static void uncorrected() {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        car.hasEngine();
        bicycle.hasEngine();
    }

    public static void correct() {
        MotorVehicle car = new MotorCar();
        GoodVehicle cradiac = new Cycle();
        car.hasWheels();
        cradiac.hasWheels();
        car.hasEngine();
    }
}

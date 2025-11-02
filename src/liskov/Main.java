package liskov;

import liskov.sub.Cycle;
import liskov.sub.GoodVehicle;
import liskov.sub.MotorCar;
import liskov.sub.MotorVehicle;

public class Main {
    /*
        Liskov substitution says that the class can be replaced with any of the similar child class
        without breaking
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

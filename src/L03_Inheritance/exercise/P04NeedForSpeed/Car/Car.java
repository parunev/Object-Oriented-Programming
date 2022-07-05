package L03_Inheritance.exercise.P04NeedForSpeed.Car;

import L03_Inheritance.exercise.P04NeedForSpeed.Vehicle;

public class Car extends Vehicle {

    private static final double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}

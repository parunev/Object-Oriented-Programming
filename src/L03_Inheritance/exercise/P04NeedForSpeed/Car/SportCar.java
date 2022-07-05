package L03_Inheritance.exercise.P04NeedForSpeed.Car;

public class SportCar extends Car {
    private static final double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePowers) {
        super(fuel, horsePowers);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}

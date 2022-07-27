package christmasRaces.entities.cars;

import christmasRaces.common.DataValidator;

import static christmasRaces.common.ExceptionMessages.INVALID_MODEL;

public class BaseCar implements Car{

    private String model;
    private int horsePower;
    private double cubicCentimeters;

    public BaseCar(String model, int horsePower, double cubicCentimeters){
        this.setModel(model);
        this.setHorsePower(horsePower);
        this.cubicCentimeters = cubicCentimeters;
    }

    void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    private void setModel(String model) {
        String exceptionMessage = String.format(INVALID_MODEL, model, 4);
        DataValidator.validateString(model, exceptionMessage, 4);
        this.model = model;
    }


    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public double getCubicCentimeters() {
        return this.cubicCentimeters;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return this.cubicCentimeters / this.horsePower * laps;
    }
}

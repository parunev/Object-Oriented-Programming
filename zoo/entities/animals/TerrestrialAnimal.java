package zoo.entities.animals;

public class TerrestrialAnimal extends BaseAnimal{
    private static double KILOGRAMS = 5.50;
    private static double INCREASE_IN_KILOGRAMS_PER_MEAL = 5.70;

    public TerrestrialAnimal(String name, String kind, double price) {
        super(name, kind, price);
    }

    @Override
    protected void setKg(double kg) {
        this.setKg(KILOGRAMS + INCREASE_IN_KILOGRAMS_PER_MEAL);
    }
}

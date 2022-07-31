package glacialExpedition.models.explorers;

public class AnimalExplorer extends BaseExplorer{
    private final static double UNITS_OF_ENERGY = 100;

    public AnimalExplorer(String name) {
        super(name, UNITS_OF_ENERGY);
    }

}

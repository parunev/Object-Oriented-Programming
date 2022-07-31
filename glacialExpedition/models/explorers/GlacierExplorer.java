package glacialExpedition.models.explorers;

public class GlacierExplorer extends BaseExplorer{
    private final static double UNITS_OF_ENERGY = 40;
    private String name;

    public GlacierExplorer(String name) {
        super(name,UNITS_OF_ENERGY);
    }

}

package glacialExpedition.models.explorers;

public class NaturalExplorer extends BaseExplorer{
    private final static double UNITS_OF_ENERGY = 60;
    private final static double DECREASE_IN_ENERGY = 7;
    private String name;

    public NaturalExplorer(String name) {
        super(name, UNITS_OF_ENERGY);
    }

    @Override
    public void search(){
        if (getEnergy() <= DECREASE_IN_ENERGY){
            super.setEnergy(0);
        }else{
            super.setEnergy(this.getEnergy() - DECREASE_IN_ENERGY);
        }
    }
}

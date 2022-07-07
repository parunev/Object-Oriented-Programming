package L04_Interfaces_and_Abstraction.lab.P05BorderControl;

public class Robot implements Identifiable {

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {return this.id;}
    public String getModel() {return this.model;}
}

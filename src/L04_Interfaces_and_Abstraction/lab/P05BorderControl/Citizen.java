package L04_Interfaces_and_Abstraction.lab.P05BorderControl;

public class Citizen implements Identifiable {

    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getId() {return id;}
    public int getAge() {return age;}
    public String getName() {return name;}
}

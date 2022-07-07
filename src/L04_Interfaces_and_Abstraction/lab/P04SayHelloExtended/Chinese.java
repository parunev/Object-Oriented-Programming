package L04_Interfaces_and_Abstraction.lab.P04SayHelloExtended;

public class Chinese extends BasePerson {
    private String name;

    public Chinese(String name) {super(name);}

    @Override
    public String getName() {return this.name;}

    @Override
    public String sayHello() {return "Djydjybydjy";}
}

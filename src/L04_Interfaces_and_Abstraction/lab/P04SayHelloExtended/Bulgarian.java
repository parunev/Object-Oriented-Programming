package L04_Interfaces_and_Abstraction.lab.P04SayHelloExtended;

public class Bulgarian extends BasePerson {
    private String name;

    public Bulgarian(String name) {super(name);}

    @Override
    public String getName() {return this.name;}

    @Override
    public String sayHello() {return "Здравей";}
}

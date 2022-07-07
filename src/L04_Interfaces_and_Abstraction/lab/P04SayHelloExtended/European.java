package L04_Interfaces_and_Abstraction.lab.P04SayHelloExtended;

public class European extends BasePerson {
    private String name;

    public European(String name) {super(name);}

    @Override
    public String getName() {return this.name;}

    @Override
    public String sayHello() {return "Hello";}
}

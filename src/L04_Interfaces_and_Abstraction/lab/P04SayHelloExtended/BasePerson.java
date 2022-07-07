package L04_Interfaces_and_Abstraction.lab.P04SayHelloExtended;

public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {this.name = name;}

    @Override
    public String getName() {return this.name;}
}

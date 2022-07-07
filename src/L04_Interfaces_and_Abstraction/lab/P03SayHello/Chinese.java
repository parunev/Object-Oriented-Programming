package L04_Interfaces_and_Abstraction.lab.P03SayHello;

public class Chinese implements Person {
    private String name;

    public Chinese(String name) {this.name = name;}

    @Override
    public String getName() {return this.name;}

    @Override
    public String sayHello() {return "Djydjybydjy";}
}

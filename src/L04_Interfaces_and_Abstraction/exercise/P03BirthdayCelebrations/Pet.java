package L04_Interfaces_and_Abstraction.exercise.P03BirthdayCelebrations;

public class Pet implements Birthable{
    private String birthDate;
    private String name;

    public Pet(String birthDate, String name){
        this.birthDate = birthDate;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}

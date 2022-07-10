package L04_Interfaces_and_Abstraction.exercise.P04FoodShortage;

public class Citizen implements Identifiable, Birthable, Person, Buyer{
    private String name;
    private int age;
    private String id, birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public void buyFood() {
        this.food+=10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}

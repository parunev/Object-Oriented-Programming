package L05_Polymorphism.exercise.P03WildFarm.Animal.Felime;

import L05_Polymorphism.exercise.P03WildFarm.Animal.Mammal.Felime;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String name, String type, double weight, String livingRegion, String breed) {
        super(name, type, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]", getType(), getName(), this.breed,
                formatter.format(getWeight()), getLivingRegion(), getFoodEaten());
    }
}

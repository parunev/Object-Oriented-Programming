package L05_Polymorphism.exercise.P03WildFarm.Animal.Mammal;

import L05_Polymorphism.exercise.P03WildFarm.Food.Food;
import L05_Polymorphism.exercise.P03WildFarm.Food.Meat;

public class  Zebra extends Mammal {
    public Zebra(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }
}

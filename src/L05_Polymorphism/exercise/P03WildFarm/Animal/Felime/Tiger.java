package L05_Polymorphism.exercise.P03WildFarm.Animal.Felime;

import L05_Polymorphism.exercise.P03WildFarm.Animal.Mammal.Felime;
import L05_Polymorphism.exercise.P03WildFarm.Food.Food;
import L05_Polymorphism.exercise.P03WildFarm.Food.Vegetable;

public class Tiger extends Felime {
    public Tiger(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }
}

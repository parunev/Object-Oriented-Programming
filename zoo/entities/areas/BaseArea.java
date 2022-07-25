package zoo.entities.areas;

import zoo.common.DataValidator;
import zoo.entities.animals.Animal;
import zoo.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static zoo.common.ExceptionMessages.AREA_NAME_NULL_OR_EMPTY;
import static zoo.common.ExceptionMessages.NOT_ENOUGH_CAPACITY;

public class BaseArea implements Area{
    private String name;
    private int capacity;
    private List<Food> foods;
    private List<Animal> animals;

    protected BaseArea(String name, int capacity){
        this.setName(name);
        this.capacity = capacity;
        this.foods = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    private void setName(String name) {
        DataValidator.validateString(name, AREA_NAME_NULL_OR_EMPTY);
        this.name = name;
    }

    @Override
    public String getName() {return this.name = name;}

    @Override
    public Collection<Animal> getAnimals() {return this.animals;}

    @Override
    public Collection<Food> getFoods() {return this.foods;}

    @Override
    public int sumCalories() {return this.foods.stream().mapToInt(Food::getCalories).sum();}

    @Override
    public void addAnimal(Animal animal) {
        if (this.animals.size() >= this.capacity){
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY);
        }
        this.animals.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {this.animals.remove(animal);}

    @Override
    public void addFood(Food food) {this.foods.add(food);}

    @Override
    public void feed() {this.animals.forEach(Animal::eat);}

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();

        String names = this.animals.isEmpty() ? "none" : this.animals
                .stream().map(Animal::getName).collect(Collectors.joining(" "));

        sb.append(String.format("%s (%s):",this.name,this.getClass().getSimpleName())).append(System.lineSeparator());

        if (this.animals.size() == 0){
            sb.append("Animal: none");
        }else{
            sb.append(String.format("Animal: %s", names));
        }

        sb.append(System.lineSeparator());
        sb.append(String.format("Food: %d",this.foods.size())).append(System.lineSeparator());
        sb.append(String.format("Calories: %d",this.sumCalories())).append(System.lineSeparator());

        return sb.toString().trim();
    }
}

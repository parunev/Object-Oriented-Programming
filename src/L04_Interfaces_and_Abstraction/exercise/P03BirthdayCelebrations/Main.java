package L04_Interfaces_and_Abstraction.exercise.P03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> collection = new ArrayList<>();

        while (true){
            String[]tokens = scanner.nextLine().split("\\s+");
            if (tokens[0].equals("End")){break;}

            String type = tokens[0];
            switch (type){
                case"Citizen": addCitizen(tokens,collection);break;
                case"Pet": addPet(tokens,collection);break;
                case"Robot": createRobot(tokens);break;
            }
        }
        String year = scanner.nextLine();

        for (Birthable element : collection){
            if (element.getBirthDate().endsWith(year)){
                System.out.println(element.getBirthDate());
            }
        }
    }

    private static void createRobot(String[] tokens) {
        String model = tokens[1];
        String id = tokens[2];

        Robot robot = new Robot(id, model);
    }

    private static void addPet(String[] tokens, List<Birthable> collection) {
        String name = tokens[1];
        String birthDate = tokens[2];

        Pet pet = new Pet(name, birthDate);
        collection.add(pet);
    }

    private static void addCitizen(String[] tokens, List<Birthable> collection) {
        String name = tokens[1];
        int age = Integer.parseInt(tokens[2]);
        String id = tokens[3];
        String birthDate = tokens[4];

        Citizen citizen = new Citizen(name, age, id, birthDate);
        collection.add(citizen);
    }
}

package L04_Interfaces_and_Abstraction.exercise.P01DefineAnInterfacePerson;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class[] citizenInterface = Citizen.class.getInterfaces();

        if (Arrays.asList(citizenInterface).contains(Person.class)){
            Method[] fields = Person.class.getDeclaredMethods();

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());

            Person person = new Citizen(name, age);

            System.out.println(fields.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }
}

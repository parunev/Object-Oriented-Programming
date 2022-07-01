package L01_Working_with_Abstraction.exercise.P01CardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");

        Arrays.stream(CardSuits.values())
                .forEach(value ->
                        System.out.printf("Ordinal value: %d; Name value: %s%n",
                                value.ordinal(), value.name()));
    }
}

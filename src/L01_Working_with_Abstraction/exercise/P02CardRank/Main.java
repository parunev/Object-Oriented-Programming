package L01_Working_with_Abstraction.exercise.P02CardRank;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        Arrays.stream(CardRank.values())
                .forEach(value ->
                        System.out.printf("Ordinal value: %d; Name value: %s%n",
                                value.ordinal(), value.name()));
    }
}

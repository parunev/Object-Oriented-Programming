package L01_Working_with_Abstraction.exercise.P05JediGalaxy;

import java.util.Arrays;

public class InputParser {
    public static int[] parseIntegerArray(String input) {

        return Arrays.stream(input.split("[\\s]+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

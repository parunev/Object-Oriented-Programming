package L01_Working_with_Abstraction.lab.P03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        boolean exit = false;

        while (!exit) {
            String[] input = scanner.nextLine().split("[\\s]+");

            if (input[0].equals("Exit")) {
                exit = true;
            }

            if (!exit) {
                studentSystem.ParseCommand(input);
            }
        }
    }
}

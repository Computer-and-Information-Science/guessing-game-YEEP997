//Justin Swiger

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        int number = random.nextInt(100) + 1; // random number between 1 and 100

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.print("Can you guess what it is? Type a number: ");

        // Read the user's guess
        int guess = scanner.nextInt();

        // Display the guess
        System.out.println("Your guess is: " + guess);

        // Reveal the number
        System.out.println("The number I was thinking of is: " + number);

        // Compute and display the difference
        int difference = Math.abs(number - guess);
        System.out.println("You were off by: " + difference);

        // Close the scanner
        scanner.close();
    }
}

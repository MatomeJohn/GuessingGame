import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Step 1: The game selects a random number between 1 and 10.
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        int attempts = 3;  // Step 2: The player has three attempts.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 10.");
        System.out.println("You have 3 attempts to guess the correct number.\n");

        // Step 3: Game loop for the player to make guesses.
        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low!\n");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!\n");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
                scanner.close();
                return;
            }
        }

        // If the player fails to guess within the attempts.
        System.out.println("Sorry, you didn't guess the number. It was " + numberToGuess + ".");
        scanner.close();
    }
}

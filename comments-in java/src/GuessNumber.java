// This is single line comment

/* This is a 
   multi-line comment */
   
import java.util.Scanner;   // Importing Scanner class for user input
import java.util.Random;   // Importing Random class for generating random numbers

public class GuessNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Create a Random object to generate random numbers
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int number = rand.nextInt(100) + 1; // nextInt(100) gives 0–99, so +1 makes it 1–100

        // Variables to store user's guess and number of attempts
        int guess = 0;
        int attempts = 0;

        // Introduction messages
        System.out.println("🎲 Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        // Game loop → continues until the correct number is guessed
        while (guess != number) {
            // Ask the user for a guess
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();  // Read input
            attempts++;            // Increase attempt count

            // Check guess against the number
            if (guess < number) {
                System.out.println("Too low! 📉 Try again.");
            } else if (guess > number) {
                System.out.println("Too high! 📈 Try again.");
            } else {
                // Correct guess
                System.out.println("🎉 Correct! You guessed it in " + attempts + " tries.");
            }
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}

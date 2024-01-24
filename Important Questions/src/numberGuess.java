import java.util.Scanner;
import java.util.Random;

public class numberGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        int userGuess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        } while (userGuess != randomNumber);

        // Close the scanner
        sc.close();
    }
}

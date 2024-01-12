import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low. Try again!");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again!");
            } else {
                hasGuessed = true;
                System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly!");
                System.out.println("You took " + attempts + " attempts to guess.");
            }
        }

        scanner.close();
    }
}


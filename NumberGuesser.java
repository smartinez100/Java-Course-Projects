import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        // initialize the scanner and random number generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // initialize the random variable to generate 100
        // 101 is exclusive so it will generate 0-100
        int number = random.nextInt(101);
        // print the message to the user
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("Can you guess what it is?");
        // capture the user's guess
        int guess = scanner.nextInt();
        // loop until the user guesses the number
        while (guess != number) {
            if (guess < number) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
            // capture and update the user's guess
            guess = scanner.nextInt();
        }
        // break while loop and print the message
        System.out.println("Congratulations! You guessed the number!");
        // avoid scanner leak
        scanner.close();
    }
}
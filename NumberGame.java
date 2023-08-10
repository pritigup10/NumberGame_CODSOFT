import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 0;
        int maxRange = 50;
//        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int actualNumber = random.nextInt(51);
        int attempts = 3;
        int guess;

        System.out.println("Welcome to the Number Game!");
        System.out.println("I have selected a secret number between " + minRange + " and " + maxRange + ".");
        System.out.println("Can you guess the number in " + attempts + " attempts?");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt #" + i + ": Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < actualNumber) {
                System.out.println("You Guessed Lower Number!");
            } else if (guess > actualNumber) {
                System.out.println("You Guessed Higher Number!");
            } else {
                System.out.println("Congratulations! You guessed the correct number " + actualNumber + " in " + i + " attempts.");
                break;
            }

            if (i == attempts) {
                System.out.println("Sorry, you've used up all your attempts. The secret number was: " + actualNumber);
            }
        }

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class RandGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc= new Scanner(System.in);

        int maxNumber = 100;
        int maxAttempts = 10;
        int guess;
        int demo=1;

        int roundsWon = 0; // Counter for rounds won by the player
        
        boolean playAgain;

        do {
            int randomNumber = random.nextInt(maxNumber) + 1;
            playAgain = false;

            System.out.println("Welcome to the Number Guessing Game!");

            for (int attempts = 1; attempts <= maxAttempts; attempts++) {
                System.out.print("Attempt " + attempts + "/" + maxAttempts + ": Enter your guess (between 1 and 100): ");
                guess = sc.nextInt();

                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    roundsWon++; // Increment roundsWon when the user wins a round
                    break; // Exit the loop when the correct number is guessed
                }

                if (attempts < maxAttempts) {
                    System.out.println("Try again.");
                } else {
                    System.out.println("Out of attempts! The correct number was: " + randomNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next();
            if (playAgainInput.equalsIgnoreCase("yes")) {
                demo+=1;
                playAgain = true;
            }

        } while (playAgain);

        System.out.println("Thank you for playing!");
        System.out.println("users score out of no.of rounds played " + roundsWon+"/"+demo); // Display rounds won
        sc.close();
}
}
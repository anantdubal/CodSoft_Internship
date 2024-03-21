package CodSoftInternshipPrograms;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
        
	public static void main(String [] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int maxAttempts = 5;
	        String playAgain = "y";
	        int score = 0;

	        while (playAgain.equalsIgnoreCase("y")) {
	            int numberToGuess = random.nextInt(100) + 1;
	            int attempts = 0;

	            System.out.println("Guess a number between 1 and 100:");

	            while (attempts < maxAttempts) {
	                int guess = scanner.nextInt();
	                attempts++;

	                if (guess == numberToGuess) {
	                    System.out.println("Congratulations! You have guessed the number correctly.");
	                    score += maxAttempts - attempts + 1;
	                    break;
	                } else if (guess < numberToGuess) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }

	                if (attempts == maxAttempts) {
	                    System.out.println("Sorry, you have reached the maximum number of attempts. The number was " + numberToGuess);
	                }
	            }

	            System.out.println("Your current score is: " + score);
	            System.out.println("Do you want to play again? (y/n)");
	            playAgain = scanner.next();
	        }

	        scanner.close();
	        System.out.println("Thank you for playing! Your final score is: " + score);
	    }
	}





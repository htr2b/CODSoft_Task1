package number;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int maxAttempt = 8;
		int score = 0;
		boolean play = true;
		System.out.println("Welcome to the Number Game");
		while (play) {
			int chosenNumber = rd.nextInt(100) + 1;
			int attempt = 0;
			boolean isTrue = false;
			System.out.println("Number has been generated between 1-100");
			while (attempt < maxAttempt && !isTrue) {
				System.out.println("Enter your guess");
				int playerGuess = sc.nextInt();
				attempt++;
				if (playerGuess == chosenNumber) {
					System.out.println("You guessed the number right.");
					isTrue = true;
					score += 10;
				} else if (playerGuess < chosenNumber) {
					System.out.println("Too low. Try higher.");
				} else {
					System.out.println("Too high. Try lower.");
				}
			}
			if (!isTrue) {
				System.out.println("Sorry, you used your chances. The number was: " + chosenNumber);
			}

			System.out.print("Do you want to play again? (yes/no): ");
			String userResponse = sc.next();
			play = userResponse.equalsIgnoreCase("yes");
		}

		System.out.println("Your final score is: " + score);
		System.out.println("Thank you for playing the Number Guessing Game!");
		sc.close();

	}
}

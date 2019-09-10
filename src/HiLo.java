import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// telling Scanner class to use keyboard input as its source
		Scanner scan = new Scanner(System.in);
		// play again, y or n
		String playAgain = "";
		// create a random number for user to guess
		do {
			int number = (int)(Math.random()*200 - 99);
			//System.out.println(number);
			int guess = 0;
			int counter = 0;
			// prompt the user:
			while (guess != number) {
				System.out.println("Guess a number between -100 and 100:");
				guess = scan.nextInt();
				System.out.println("You entered " + guess + ".");
				if (guess < number) {
					counter = counter + 1;
					System.out.println(guess + " is too low, try again");					
				}
				else if (guess > number) {
					counter = counter + 1;
					System.out.println(guess + " is too high, try again");					
				}
				else 
					System.out.println(guess + " is correct. You won in " + counter + " guesses!");
			}
			System.out.println("Do you want to play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thanks for playing! Goodbye");
		scan.close();
	}
}

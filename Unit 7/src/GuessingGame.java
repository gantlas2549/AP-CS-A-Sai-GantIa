//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int goal = (int)(Math.random() * upperBound + 1);
		int counter = 0;
		int guess = 0;
		if (upperBound < 2) {
			upperBound = 2;
		}
		do {
			System.out.print("Guess a number between 1 and " + upperBound + " :: ");
			guess = keyboard.nextInt();
			counter ++;
			if (guess < 1) {
				System.out.println("Too low. Out of bounds.");
				counter --;
			}
			if (guess > upperBound) {
				System.out.println("Too high. Out of bounds.");
				counter --;
			}
		}while (guess != goal);

		System.out.println("\nThe answer was " + goal);
		double calc = (((counter - 1) * 100)/upperBound);
		System.out.println("You guessed wrong " + calc + " percent of the time.");

	}
	
	public String toString()
	{
		String output="";
		return output;
	}
}
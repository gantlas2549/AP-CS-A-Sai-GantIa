//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letterA = keyboard.next().charAt(0);
		CharacterAnalyzer testA = new CharacterAnalyzer(letterA);
		out.println(testA);   //A

		out.print("Enter a number :: ");
		char letter1 = keyboard.next().charAt(0);
		CharacterAnalyzer test1 = new CharacterAnalyzer(letter1);
		out.println(test1);   //1


		out.print("Enter a letter :: ");
		char lettera = keyboard.next().charAt(0);
		CharacterAnalyzer testa = new CharacterAnalyzer(lettera);
		out.println(testa);   //a
		
		out.print("Enter a number :: ");
		char letter7 = keyboard.next().charAt(0);
		CharacterAnalyzer test7 = new CharacterAnalyzer(letter7);
		out.println(test7);   //7
		
		
		out.print("Enter a letter :: ");
		char letterD = keyboard.next().charAt(0);
		CharacterAnalyzer testD = new CharacterAnalyzer(letterD);
		out.println(testD);   //D
		
		out.print("Enter a number :: ");
		char letter2 = keyboard.next().charAt(0);
		CharacterAnalyzer test2 = new CharacterAnalyzer(letter2);
		out.println(test2);   //2
		
		out.print("Enter a letter :: ");
		char letterX = keyboard.next().charAt(0);
		CharacterAnalyzer testX = new CharacterAnalyzer(letterX);
		out.println(testX);   //X
		
		out.print("Enter a letter :: ");
		char letterZ = keyboard.next().charAt(0);
		CharacterAnalyzer testZ = new CharacterAnalyzer(letterZ);
		out.println(testZ);   //Z
		
		out.print("Enter a letter :: ");
		char letter9 = keyboard.next().charAt(0);
		CharacterAnalyzer test9 = new CharacterAnalyzer(letter9);
		out.println(test9);   //9
		//add more test cases
		
		
		
		
		
		
		
		

	}
}
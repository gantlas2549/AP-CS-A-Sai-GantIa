//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab18a
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int size;
		String name;
		out.println("Enter 1st monster's name : ");
		name = keyboard.next();
		out.println("Enter 1st monster's size : ");
		size=keyboard.nextInt();
		Monster mOne = new Monster(name,size);
		
		out.println("Enter 2nd monster's name : ");
		name = keyboard.next();
		out.println("Enter 2nd monster's size : ");
		size=keyboard.nextInt();
		Monster mTwo = new Monster(name,size);
		
		if (mOne.isBigger(mTwo)==true)
		{
			out.println("monster 1 is bigger than monster 2");
		}
		if (mTwo.isBigger(mOne)==true) { out.println("monster 2 is bigger than monster 1"); }
		if (mOne.namesTheSame(mTwo)==true) { out.println("same name"); }
		
		//ask for name and size
		
		//instantiate monster one
		
		
		//ask for name and size
		
		//instantiate monster two


	}
}
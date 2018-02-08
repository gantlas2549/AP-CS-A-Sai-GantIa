//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		
		Scanner keyboard = new Scanner(System.in);
	   	System.out.println("Enter X1 :: ");
	   	int onea = keyboard.nextInt();
	   	System.out.println("Enter Y1 :: ");
	   	int oneb = keyboard.nextInt();
	   	System.out.println("Enter X2 :: ");
	   	int onec = keyboard.nextInt();
	   	System.out.println("Enter Y2 :: ");
	   	int oned = keyboard.nextInt();
	   	
	   	Distance test = new Distance();
	   	test.setCoordinates(onea, oneb, onec, oned);
	   	test.calcDistance();
	   	test.print();
		
	   	System.out.println("Enter X1 :: ");
	   	int twoa = keyboard.nextInt();
	   	System.out.println("Enter Y1 :: ");
	   	int twob = keyboard.nextInt();
	   	System.out.println("Enter X2 :: ");
	   	int twoc = keyboard.nextInt();
	   	System.out.println("Enter Y2 :: ");
	   	int twod = keyboard.nextInt();
	   	
	   	test.setCoordinates(twoa, twob, twoc, twod);
	   	test.calcDistance();
	   	test.print();
	   	
	   	System.out.println("Enter X1 :: ");
	   	int threea = keyboard.nextInt();
	   	System.out.println("Enter Y1 :: ");
	   	int threeb = keyboard.nextInt();
	   	System.out.println("Enter X2 :: ");
	   	int threec = keyboard.nextInt();
	   	System.out.println("Enter Y2 :: ");
	   	int threed = keyboard.nextInt();

	   	test.setCoordinates(threea, threeb, threec, threed);
	   	test.calcDistance();
	   	test.print();
			
	}
}
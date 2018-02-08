//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
   	Scanner keyboard = new Scanner(System.in);
   	System.out.println("Enter a :: ");
   	int onea = keyboard.nextInt();
   	System.out.println("Enter b :: ");
   	int oneb = keyboard.nextInt();
   	System.out.println("Enter c :: ");
   	int onec = keyboard.nextInt();
   	
   	Quadratic test = new Quadratic();
   	test.setEquation(onea, oneb, onec);
   	test.calcRoots();
   	test.print();
   	
   	Scanner keyboard2 = new Scanner(System.in);
   	System.out.println("\nEnter a :: ");
   	int twoa = keyboard.nextInt();
   	System.out.println("Enter b :: ");
   	int twob = keyboard.nextInt();
   	System.out.println("Enter c :: ");
   	int twoc = keyboard.nextInt();
   	
   	Quadratic test2 = new Quadratic();
   	test.setEquation(twoa, twob, twoc);
   	test.calcRoots();
   	test.print();
   	
   	Scanner keyboard3 = new Scanner(System.in);
   	System.out.println("\nEnter a :: ");
   	int threea = keyboard.nextInt();
   	System.out.println("Enter b :: ");
   	int threeb = keyboard.nextInt();
   	System.out.println("Enter c :: ");
   	int threec = keyboard.nextInt();
   	
   	Quadratic test3 = new Quadratic();
   	test.setEquation(threea, threeb, threec);
   	test.calcRoots();
   	test.print();
   	
   	Scanner keyboard4 = new Scanner(System.in);
   	System.out.println("\nEnter a :: ");
   	int foura = keyboard.nextInt();
   	System.out.println("Enter b :: ");
   	int fourb = keyboard.nextInt();
   	System.out.println("Enter c :: ");
   	int fourc = keyboard.nextInt();
   	
   	Quadratic test4 = new Quadratic();
   	test.setEquation(foura, fourb, fourc);
   	test.calcRoots();
   	test.print();
   	
   	Scanner keyboard5 = new Scanner(System.in);
   	System.out.println("\nEnter a :: ");
   	int fivea = keyboard.nextInt();
   	System.out.println("Enter b :: ");
   	int fiveb = keyboard.nextInt();
   	System.out.println("Enter c :: ");
   	int fivec = keyboard.nextInt();
   	
		
		
	Quadratic test5 = new Quadratic();
	test.setEquation(fivea, fiveb, fivec);
	test.calcRoots();
   	test.print();
   	
		
		
	}
}
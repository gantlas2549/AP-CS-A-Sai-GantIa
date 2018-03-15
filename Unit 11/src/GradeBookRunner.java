//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
	   	String name;
	   	int num; 
	   
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the name of this class?");
		name = keyboard.nextLine();
		
		System.out.println("How many students are in this class?");
		num = keyboard.nextInt(); 
		keyboard.nextLine();
		Class classUse = new Class(name, num);
		
		int i = 0;
		do {
			System.out.println("Enter the name of the student");
			String stuName = keyboard.nextLine(); 
			
			System.out.println("Enter the grades for " + stuName);
			System.out.println("Use the format x - grades (2 - 100 100)");
			String grades = keyboard.nextLine();
			
			Student s = new Student(stuName, grades);
			classUse.addStudent(i, s);
			
			i++;
		} while (i < num);
		
		System.out.println(classUse);
		
		
		System.out.println("Failure List = " + classUse.getFailureList(70));
		System.out.println("Highest Average = " + classUse.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + classUse.getStudentWithLowestAverage());
		System.out.println("Class average = " + classUse.getClassAverage());
   }
   

















}		

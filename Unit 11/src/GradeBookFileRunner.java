//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.util.ArrayList;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!\n\n");
		Scanner file = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Documents\\GitHub\\AP-CS-A-Sai-Gantla\\Unit 11\\src\\gradebook.dat"));
		String name = file.nextLine();
		int num = Integer.parseInt(file.nextLine());
		Class classUse = new Class(name, num);
		for (int i = 0; i < num; i++){
			Student stu = new Student(file.nextLine(), file.nextLine());
			classUse.addStudent(i, stu);
		}
		out.println(classUse);
		
		out.println(classUse);
		out.println("Failure List = " + classUse.getFailureList(65));
		out.println("Highest Average = " + classUse.getStudentWithHighestAverage());
		out.println("Lowest Average = " + classUse.getStudentWithLowestAverage());
		
		out.println("Class average = " + classUse.getClassAverage());
		classUse.sort();

	}		
}
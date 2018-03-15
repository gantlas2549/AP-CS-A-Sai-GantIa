//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades
{
	private ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		grades = new ArrayList<Double>(Integer.parseInt(gradeList.substring(0, 1)));
		gradeList = gradeList.substring(4);
		String[] z = gradeList.split(" ");
		for (int i = 0; i < z.length; i++){
		grades.add(Double.parseDouble(z[i]));
		}

	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.size(); i++){
			sum += grades.get(i);
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double lowGrade = grades.get(0);
		for (int i = 1; i < grades.size(); i++){
			if (grades.get(i) < lowGrade){
				lowGrade = grades.get(i);
			}
		}
		return lowGrade;
	}
	
	public double getHighGrade()
	{
		double highGrade = grades.get(0);
		for (int i = 1; i < grades.size(); i++){
			if (grades.get(i) > highGrade){
				highGrade = grades.get(i);
			}
		}
		return highGrade;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		for (int i = 0; i < grades.size(); i++){
			output += grades.get(i) + " ";
		}
		return output;
	}	
}
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

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList = new ArrayList<Student>();
	}
	
	public Class(String name1, int stuCount)
	{
		name = name1;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i = 0; i < studentList.size(); i++){
			classAverage = classAverage + getStudentAverage(i);
		}
		classAverage = classAverage/studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int num = 0;
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getName() == stuName){
				num = i;
			}
		}
		return studentList.get(num).getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		
		String studentHigh = "";
		Arrays.sort(studentList);
		studentHigh = studentList[studentList.length -1].getName();
		return studentHigh;
	}

	public String getStudentWithLowestAverage()
	{
		
		String studentLow = "";
		Arrays.sort(studentList);
		studentLow = studentList[0].getName();
		return studentLow;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() < failingGrade){
				output += studentList.get(i).getName() + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output= getClassName();
		for (int i = 0; i < studentList.size(); i++){
			output += "\n" + studentList.get(i).toString() + "\t" + studentList.get(i).getAverage();
		}
		return output;
	}  
	
}
































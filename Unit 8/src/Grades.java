//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;

import java.lang.Math;

import java.util.Scanner;

public class Grades

{


	//instance variables
	int max = 0;
	double[] realgradesarray;

	//constructor

	public Grades (int rnmax, String input){
		Scanner in = new Scanner(input);
		max = rnmax;
		String[] gradestrarray = input.split(" ");
		double[] gradesarray = new double[gradestrarray.length];
		for (int i = 0; i < gradestrarray.length; i++){
			gradesarray[i] = in.nextDouble();

		}

		realgradesarray = gradesarray;
	}


	//set method

	public void setGrades (int rnmax, String input){
		Scanner in = new Scanner(input);
		max = rnmax;
		String[] gradestrarray = input.split(" ");
		double[] gradesarray = new double[gradestrarray.length];
		for (int i = 0; i < gradestrarray.length; i++){
			gradesarray[i] = in.nextDouble();
		}
			
		realgradesarray = gradesarray;
	}

	private double getSum()
	{
		double sum = 0.0;
		for(double d : realgradesarray){
			sum = sum + d;
		}

		return sum;
	}

	public double getAverage()

	{


		double average=0.0;
		average = getSum()/realgradesarray.length;
		return average;

	}


	//toString method


	public String toString()
	{
		String out = "";
		for(int i = 0; i < realgradesarray.length; i++){
			out = out + "Grade " + i + ":: " + realgradesarray[i] + "\n";
		}
		out = out + "\n \n" + "Average: " + getAverage();
		return out;
	}

}













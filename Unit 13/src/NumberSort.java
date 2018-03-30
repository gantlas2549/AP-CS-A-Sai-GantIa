//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int x = 0;
		while(number >0){
			number = number/10;
			x++;
		}
		return x;
		
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int y = getNumDigits(number);
		int[] sorted = new int[y];
		
		for(int i = 0;i < y;i++){
			sorted[i] = number % 10;
			number = number / 10;
		}
		for(int i = 0; i < sorted.length; i++) {
			for(int x = 0; x < sorted.length-1; x++) {
				if(sorted[x] > sorted[x+1]) {
					int temp = sorted[x];
					sorted[x] = sorted[x+1];
					sorted[x+1] = temp;
				}
			}
		}
		
		return sorted;
	}

}

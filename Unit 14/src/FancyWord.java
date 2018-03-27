//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
	public FancyWord()
	{
mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   int size = s.length();
	   mat = new char[size][size];
	   for(int i=0;i<size;i++)
	   {
		   mat[0][i] = s.charAt(i);
           mat[i][i] = s.charAt(i);
		   mat[size-i-1][i] = s.charAt(i);
		   mat[size-1][i] = s.charAt(i);
	   }
	 
	}

	public String toString()
	{

		String output="";
		for(int i=0; i<mat[0].length;i++)
		{
			
			for(int y=0;y<mat[0].length;y++)
			{
				output = output + mat[i][y];
			}
				output = output + "\n";
		}

		return output+"\n\n";
		



	}
}
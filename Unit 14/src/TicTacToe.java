//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
mat = new char[0][0];

	}

	public TicTacToe(String game)
	{

		mat = new char[3][3];
		int counter =0;
		for(int i=0;i<mat.length;i++)
		{
			for(int y=0;y<mat.length;y++)
			{
				mat[i][y] = game.charAt(counter++);
			}
		}



	}

	public String getWinner()
	{
		for(int i=0;i<mat.length;i++)
		{
			if(mat[0][i] == mat[1][i] && (mat[0][i] == mat[2][i]))
			{
				return mat[0][i] + "wins vertically";
			}
			if(mat[i][0] == mat[i][2] && mat[i][0] == mat[i][1])
			{
				return mat[i][0] +"wins horizontally";
			}
		}
		if((mat[0][0] == mat[1][1] && mat[0][0] == mat[2][2]) || (mat[0][2] == mat[1][1] && mat[0][2] == mat[2][0]))
		{
			return mat[1][1] + "wins diagonally";
		}
		
		return "cat's game - no winner!";
		//refresh
		
	}

	public String toString()
	{
		String output="";
		output+=getWinner();
		return output+"\n\n";
	}
}
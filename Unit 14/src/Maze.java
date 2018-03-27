//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exit = false;

	public Maze()
	{
		maze = new int[0][0];

	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		Scanner find = new Scanner(line);
		for (int i = 0; i < size; i++) {
			for (int y = 0; y<size;y++) {
				maze[i][y] = find.nextInt();
			}
		}

	}

	public boolean hasExitPath(int r, int c)
	{
		if(r >=0 && r < maze.length && c>=0 && c<maze.length && maze[r][c] ==1) {
			maze[r][c] = 2;
			if (c == maze[r].length-1) {
				exit = true;
				return exit;
			}
			else {
				hasExitPath(r-1,c);
				hasExitPath(r,c+1);
				hasExitPath(r+1,c);
				hasExitPath(r,c-1);
			}
		}
		return false;
	}

	public String toString()
	{
		String output="";
		hasExitPath(0,0);	
		
		if (exit = true) {
		output = "exit found";
		}
		else {
			output = "exit not found";
		}
		return output;
	}
}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Desktop\\Unit14_2016\\Unit14-Assignments\\lab21i.dat"));
		Maze maze1 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		out.println(maze1 + "\n");
		
		Maze maze2 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		out.println(maze2 + "\n");
		
		Maze maze3 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		out.println(maze3 + "\n");
		
		Maze maze4 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		out.println(maze4 + "\n");
		
		Maze maze5 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		out.println(maze5 + "\n");
	}
}
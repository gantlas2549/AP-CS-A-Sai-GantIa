//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
Scanner file = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Desktop\\Unit12-2016\\Unit12-Assignments\\lab18e\\lab18e.dat"));
		
		int size = 0;
		int x = 0;
		
		Word18e[] sarray = new Word18e[size];
		
		while(true) {
			if (size == 0) {
			size = Integer.parseInt(file.nextLine());
			sarray = new Word18e[size];
			} else {
			sarray[x] = new Word18e(file.nextLine());
			x++;
			}
		if (x==size) {
			break;
		}
	}

		Arrays.sort(sarray);
		for (int y=0;y<size;y++) {
			out.println(sarray[y]);
	}











	}
}
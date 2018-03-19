//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Desktop\\Unit12-2016\\Unit12-Assignments\\lab18d\\lab18d.dat"));
		
		int size = 0;
		int x = 0;
		
		Word[] sarray = new Word[size];
		
		while(true) {
			if (size == 0) {
			size = Integer.parseInt(file.nextLine());
			sarray = new Word[size];
			} else {
			sarray[x] = new Word(file.nextLine());
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
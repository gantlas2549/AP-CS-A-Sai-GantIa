//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Desktop\\Unit13-2016\\Unit13-Assignments\\lab15d.dat"));
		int num = file.nextInt();
		for(int i=0;i<=num;i++)
		{
			FancyWords monkaS = new FancyWords(file.nextLine());
			System.out.println(monkaS);
		}




	}
}
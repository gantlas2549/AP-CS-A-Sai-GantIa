//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab16e
{
	public static void main( String args[] ) throws IOException
	{
		Histogram history1 = new Histogram(new char[]{'a','b','c'},"C:\\Users\\Master Sai Gantla\\Desktop\\Unit10-2016\\Unit10-Assignments\\Lab16e1.dat");
		history1.loadAndAnalyzeFile();
		out.println("Letters occurring most : "+history1.mostFrequent());
		out.println("Letters occurring least : "+history1.leastFrequent());
		out.println("\n");
		out.println(history1);

		Histogram history2 = new Histogram(new char[]{'d','e','a'},"C:\\\\Users\\\\Master Sai Gantla\\\\Desktop\\\\Unit10-2016\\\\Unit10-Assignments\\\\Lab16e2.dat");
		history2.loadAndAnalyzeFile();
		out.println("Letters occurring most : "+history2.mostFrequent());
		out.println("Letters occurring least : "+history2.leastFrequent());
		out.println("\n");
		out.println(history2);
		
		Histogram history3 = new Histogram(new char[]{'x','a','r','g'},"C:\\\\Users\\\\Master Sai Gantla\\\\Desktop\\\\Unit10-2016\\\\Unit10-Assignments\\\\Lab16e3.dat");
		history3.loadAndAnalyzeFile();
		out.println("Letters occurring most : "+history3.mostFrequent());
		out.println("Letters occurring least : "+history3.leastFrequent());
		out.println("\n");
		out.println(history3);
	}
}
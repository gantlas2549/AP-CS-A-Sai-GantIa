//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> chars;
	private char[] vals;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		chars = new ArrayList<Character>();
		fileName = "";
	}

	public Histogram(char[] v, String file)
	{
		count = new ArrayList<Integer>();
		chars = new ArrayList<Character>();
		vals = v;
		fileName = file;
		out.println("search chars = "+Arrays.toString(vals));
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		try {
			Scanner file = new Scanner(new File(fileName));
			file.nextLine();
			while(file.hasNext()){
				String s = file.next();
				for(int i = 0; i < s.length(); i++) {
					chars.add(s.charAt(i));
				}
			}
			file.close();
		}
		catch(Exception IOException) {
			out.println("Houston, we have a problem.");
		}
		for(int i = 0; i < vals.length; i++) {
			int c = 0;
			for(int j = 0; j < chars.size(); j++) {
				if(vals[i] == chars.get(j)) c+=1;
			}
			count.add(c);
		}
	}

	public char mostFrequent()
	{
		int max = count.get(0);
		for(int i = 1; i < count.size(); i++) {
			if(count.get(i) > max) max = count.get(i);
		}
		return vals[count.indexOf(max)];
	}

	public char leastFrequent()
	{
		int min = count.get(0);
		for(int i = 1; i < count.size(); i++) {
			if(count.get(i) < min) min = count.get(i);
		}
		return vals[count.indexOf(min)];
	}

	public String toString()
	{
	   return fileName + Arrays.toString(vals)+ count;
	}
}}
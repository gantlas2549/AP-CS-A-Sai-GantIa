//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjs;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjs = new ArrayList<String>();
		loadNouns();
		loadVerbs();
		loadAdjs();
	}

	public void loadNouns()
	{
		try{
			Scanner theNouns = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Desktop\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			
			int i = 0;
			while(theNouns.hasNext()) nouns.add(i++, theNouns.next());
			theNouns.close();
		}
		catch(Exception e){
			out.println("Houston, we have a problem!");
		}	
	}
	
	public void loadVerbs()
	{
		try{
			Scanner theVerbs = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Desktop\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			
			int i = 0;
			while(theVerbs.hasNext()) verbs.add(i++, theVerbs.next());
			theVerbs.close();
		}
		catch(Exception e){
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjs()
	{
		try{
			Scanner theAdjs = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Desktop\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			
			int i = 0;
			while(theAdjs.hasNext()) adjs.add(i++, theAdjs.next());
			theAdjs.close();
		}
		catch(Exception e){
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomNoun()
	{
		int randInt = (int) (Math.random() * nouns.size());
		return nouns.get(randInt);
	}
	
	public String getRandomVerb()
	{
		int randInt = (int) (Math.random() * verbs.size());
		return verbs.get(randInt);
	}
	
	public String getRandomAdj()
	{
		int randInt = (int) (Math.random() * adjs.size());
		return adjs.get(randInt);
	}		

	public String toString()
	{
		String first = "";
		String second = "";
		try{
			Scanner fileMad = new Scanner(new File("C:\\Users\\Master Sai Gantla\\Desktop\\Unit10-2016\\Unit10-Assignments\\Lab16d\\story.dat"));
			while(fileMad.hasNext()) first+=fileMad.next()+" ";
			fileMad.close();
		}
		catch(Exception e){
			out.println("Houston, we have a problem!");
		}
		String[] splitMad = first.split(" ");
		for(int i = 0; i < splitMad.length; i++) {
			String c = splitMad[i];
			if(c.equals("#")) splitMad[i] = getRandomNoun();
			else if(c.equals("@")) splitMad[i] = getRandomVerb();
			else if(c.equals("&")) splitMad[i] = getRandomAdj();
		}
		second = String.join(" ", splitMad);
		return second+"\n\n\n";
	} 
}}
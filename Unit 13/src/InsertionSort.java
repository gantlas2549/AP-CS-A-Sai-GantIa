//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}
	public void add(String  word)
	{
		int loc = Collections.binarySearch(list, word);
		if(loc > 0) {
			return;
		}
		else {
			list.add(Math.abs(1+loc),word);
		}
	}
	public void remove(String word)
	{

		for(int i = 0;i < list.size();i++){
			if(list.get(i).equals(word)){
				list.remove(i);		
			}
		}

	}

	public String toString()
	{
		String output = "";
		for(String i:list){
			output = output + i + " ";
		}
		return output;
	}
}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word18e implements Comparable<Word18e>
{
	private String word;

	public Word18e( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		char words[] = word.toCharArray();
		char vowel[] = vowels.toCharArray();		
		for(int w = 0;w<word.length();w++) {
			for(int v=0;v<vowels.length();v++) {
				if (words[w] == vowel[v]) {
					vowelCount++;
				}
			}
		}
			return vowelCount;
}

	public int compareTo(Word18e rhs)
	{
		if (numVowels() == rhs.numVowels()) {
			return word.compareTo(rhs.word);
		} else if (numVowels() > rhs.numVowels()) {
			return 1;
		} else return -1;

	}

	public String toString()
	{
		return word;
	}
}
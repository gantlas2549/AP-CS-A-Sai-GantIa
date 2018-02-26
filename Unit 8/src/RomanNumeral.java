//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
public class RomanNumeral
{
	private Integer num;
	private String roman;
	private final static int[] NUMBERS= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private final static String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	
	public RomanNumeral(String str)
	{

		roman = str;
		int sum = 0;
		for(int i = 0; i < roman.length() - 1; i++){
			//checks if either the single letter or double letter combo is in the list, if it is then converts it to integer
			//takes advantage of the fact that the max length is only two letters

			String s1 = roman.substring(i, i+1);
			String s2 = roman.substring(i, i+2);
			boolean changed = false;
			for(int c = 0; c < LETTERS.length; c++){
				if (LETTERS[c].equals(s2)){
					//convert to int
					sum = sum + NUMBERS[c];
					changed = true;
				}	
			}

			if (changed == false){
				for(int c = 0; c < LETTERS.length; c++){
					if (LETTERS[c].equals(s1)){
						//convert to int
						sum = sum + NUMBERS[c];
						changed = true;

					}
				}
			}
		}

//convert from roman to int
		num = sum;
	}
	public RomanNumeral(Integer orig)

	{
		setNumber(orig);
//convert from int to roman
	}

	public void setNumber(Integer num)
	{
		int i = 0;
		int rnnum = num;
		String rnstr = "";

		while(rnnum > 0){
			if(rnnum  >= NUMBERS[i]){
				rnstr += LETTERS[i];
				rnnum -= NUMBERS[i];
			}

			else{
				i++;
			}
		}


		roman = rnstr;


	}


	public void setRoman(String rom)


	{


		roman = rom;


		boolean skip = false;


		


		int sum = 0;


		for(int i = 0; i < roman.length(); i++){


			//checks if either the single letter or double letter combo is in the list, if it is then converts it to integer


			//takes advantage of the fact that the max length is only two letters


			String s1 = roman.substring(i, i+1);


			String s2;


			if (i == roman.length() - 1){


				s2 = "null";


			}


			else {


				s2 = roman.substring(i, i+2);


			}


			


			boolean changed = false;


			


			//skips this iteration of the for loop if skip = true was just triggered by the last iteration of the for loop


			if (skip == true){


				skip = false;


				continue;


			}


			


			for(int c = 0; c < LETTERS.length; c++){


				if (LETTERS[c].equals(s2)){


					//convert to int


					sum = sum + NUMBERS[c];


					changed = true;


					//if a two char substring was just added to sum from romanstr, then skip the next iteration of the for loop


					//because or else it could recount the second char of the two-char substring as a single char substring


					skip = true;


				}	


			}


			


			if (changed == false){


				for(int c = 0; c < LETTERS.length; c++){


					if (LETTERS[c].equals(s1)){


						//convert to int


						sum = sum + NUMBERS[c];


						


					}


					


				}


			}


		}


//convert from roman to int


		num = sum;







	}







	public Integer getNumber()


	{


		return num;


	}







	public String toString()


	{


		return roman + "\n";


	}


}

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter count = new AtCounter();
		//test the code
		count.countAts(0, 0);
		out.println(count);
		
		count = new AtCounter();
		count.countAts(2, 5);
		out.println(count);
		
		count = new AtCounter();
		count.countAts(5, 0);
		out.println(count);

		count = new AtCounter();
		count.countAts(9, 9);
		out.println(count);

		count = new AtCounter();
		count.countAts(3, 9);
		out.println(count);
	}
}
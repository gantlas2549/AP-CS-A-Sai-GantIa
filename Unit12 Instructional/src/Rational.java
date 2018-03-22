//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class Rational implements Comparable<Rational>
{
	//add two instance variables
private int numerator;
private int denominator;
	//write two constructors

public Rational() { 
	setRational(1,1);	
	}

public Rational(int numerator, int denominator) {
	setRational(numerator, denominator);
}

	//write a setRational method
	public void setRational(int numerator, int denominator) 
	{
		setNumerator(numerator);
		setDenominator(denominator);
	}

	//write  a set method for numerator and denominator

	public void setNumerator(int numerator)
	{
		this.numerator=numerator;
	}
	public void setDenominator(int denominator)
	{
		this.denominator=denominator;
	}
	public void add(Rational  rhs)
	{
	setNumerator(getNumerator()*rhs.getDenominator()+rhs.getNumerator()*getDenominator());
	setDenominator(getDenominator()*rhs.getDenominator());
	reduce();
	}
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		
	private void reduce()
	{
		int gcd = gcd(getNumerator(),getDenominator());
		setNumerator(getNumerator()/gcd);
		setDenominator(getDenominator()/gcd);
	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for (int x = min; x>1; x--) {
			if(numOne%x==0 && numTwo%x==0)
				return x;
		}

		return 1;
	}

	public Object clone ()
	{
		Rational r = new Rational(getNumerator(), getDenominator());
				return r;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object other)
	{
		Rational rhs = (Rational)other;
		double one = (double)getNumerator()/getDenominator();
		double two = (double)rhs.getNumerator()/rhs.getDenominator();
		if(one==two)
			return true;
		return false;
	}

	public int compareTo(Rational rhs)
	{
		double top = (double)getNumerator()/getDenominator();
		double bottom = (double)rhs.getNumerator()/rhs.getDenominator();
		if(top==bottom)
			return 0;
		if(top>bottom)
			return 1;
		return -1;
	}

public int getNumerator() {
	return numerator;
}
public int getDenominator() {
	return denominator;
}
public String toString()
{
	return getNumerator() + "/" + getDenominator();
}

	
	//write  toString() method
	
	
}
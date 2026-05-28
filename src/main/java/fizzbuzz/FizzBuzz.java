//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

	private BuzzwordCalculator buzzwordCalculator;

	public FizzBuzz(BuzzwordCalculator buzzwordCalculator) {
		this.buzzwordCalculator = buzzwordCalculator;
	}

	public String translate(int number) {
		return buzzwordCalculator.gatherBuzzwords(number);
	}

}
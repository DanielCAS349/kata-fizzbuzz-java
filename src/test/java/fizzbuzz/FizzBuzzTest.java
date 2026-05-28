package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	private BuzzwordCalculatorImpl buzzwordCalculatorImpl = new BuzzwordCalculatorImpl();

	@Test
	public void Fizz() {
		FizzBuzz fizzer = new FizzBuzz(buzzwordCalculatorImpl);
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Buzz() {
		FizzBuzz buzzer = new FizzBuzz(buzzwordCalculatorImpl);
		String result = buzzer.translate(14);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		FizzBuzz fizzbuzzer = new FizzBuzz(buzzwordCalculatorImpl);
		String result = fizzbuzzer.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		FizzBuzz rand = new FizzBuzz(buzzwordCalculatorImpl);
		String result = rand.translate(4);
		assertEquals("4", result);
	}
}

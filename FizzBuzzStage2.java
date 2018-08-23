/**
 * Prints a list of 1 to 100, if divisible by 3 or contains digit 3 print Fizz, if divisible by 5 or contains digit 5 
 * print Buzz, if we fulfil both conditions print FizzBuzz
 **/
public class FizzBuzzStage2 {

	public static void main(String[] args) 
	{
		for (int i=1; i<=100; i++)
		{
			if (firstIntegerIsDivisibleBySecondOrFirstIntegerContainsDigitOfSecond(i, FizzBuzz.FIZZ_NUMBER)
			  && firstIntegerIsDivisibleBySecondOrFirstIntegerContainsDigitOfSecond(i, FizzBuzz.BUZZ_NUMBER))
			{
				System.out.println(FizzBuzz.FIZZBUZZ_STRING);
			}
			else if (firstIntegerIsDivisibleBySecondOrFirstIntegerContainsDigitOfSecond(i, FizzBuzz.FIZZ_NUMBER))
			{
				System.out.println(FizzBuzz.FIZZ_STRING);
			}
			else if (firstIntegerIsDivisibleBySecondOrFirstIntegerContainsDigitOfSecond(i, FizzBuzz.BUZZ_NUMBER))
			{
				System.out.println(FizzBuzz.BUZZ_STRING);
			}
			else
			{
				System.out.println(""+i);
			}
		}
	}
	
	/**
	 * Returns whether the first integer is divisible by the second, or the first integer contains a Digit of the second
	 */
	private static boolean firstIntegerIsDivisibleBySecondOrFirstIntegerContainsDigitOfSecond(int number, int fizzOrBuzzNumber)
	{
		//the first condition is divisibility
		boolean firstIntegerIsDivisibleBySecond = FizzBuzz.firstIntegerIsDivisibleBySecond(number, fizzOrBuzzNumber);
		
		//the second condition is whether the digit is contained
		String numberStr = ""+number;
		String fizzOrBuzzNumberStr = ""+fizzOrBuzzNumber;
		boolean firstIntegerContainsDigitOfSecondInteger = numberStr.contains(fizzOrBuzzNumberStr);
		
		//return true if either condition is satisfied
		return firstIntegerIsDivisibleBySecond || firstIntegerContainsDigitOfSecondInteger;
	}
}

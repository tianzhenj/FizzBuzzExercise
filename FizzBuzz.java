/**
 * Prints a list of 1 to 100, if divisible by 3 print Fizz, if divisible by 5 print Buzz, if divisible by both print
 * FizzBuzz
 **/
public class FizzBuzz {
	
	//numbers which represent whether we print Fizz or Buzz
	public static int FIZZ_NUMBER = 3;
	public static int BUZZ_NUMBER = 5;
	
	//strings which we print for Fizz, Buzz
	public static String FIZZ_STRING = "Fizz";
	public static String BUZZ_STRING = "Buzz";
	public static String FIZZBUZZ_STRING = "FizzBuzz";

	public static void main(String[] args) 
	{
		for (int i=1; i<=100; i++)
		{
			if (firstIntegerIsDivisibleBySecond(i, FIZZ_NUMBER)
			  && firstIntegerIsDivisibleBySecond(i, BUZZ_NUMBER))
			{
				System.out.println(FIZZBUZZ_STRING);
			}
			else if (firstIntegerIsDivisibleBySecond(i, FIZZ_NUMBER))
			{
				System.out.println(FIZZ_STRING);
			}
			else if (firstIntegerIsDivisibleBySecond(i, BUZZ_NUMBER))
			{
				System.out.println(BUZZ_STRING);
			}
			else
			{
				System.out.println(""+i);
			}
		}
	}
	
	/**
	 * Returns whether the first integer is divisible by the second
	 */
	public static boolean firstIntegerIsDivisibleBySecond(int firstInteger, int secondInteger)
	{
		return firstInteger % secondInteger == 0;
	}
}

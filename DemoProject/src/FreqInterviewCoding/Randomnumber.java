package FreqInterviewCoding;

import java.util.Random;

public class Randomnumber 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		int randomnum =rand.nextInt(10); //here 10 represent the number till 1 to 9
		System.out.println(randomnum);
		
		double randomdouble = rand.nextDouble(10);
		System.out.println(randomdouble);
		
		//String
		
		String randomnumber = RandomStringUtils.randomNumeric(5); //here it generates 5 digit random number
		System.out.println(randomnumber);
		String randomString =RandomStringUtils.randomAlphabetic(5);
		System.out.println(randomString);
		
		
	}
}

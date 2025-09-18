package Tech_Rostrum;

public class Day4CountOccurenceofCharinString {

	public static void main(String[] args)
	{
		//count the char 'a' in above String
		String sentence = "Java is object oriented Programming";
		
		int result = sentence.length()-sentence.replaceAll("a","").length();
		
		System.out.println(result);

	}

}

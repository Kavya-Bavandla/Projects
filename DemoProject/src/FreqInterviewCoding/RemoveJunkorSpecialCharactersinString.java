package FreqInterviewCoding;

import java.util.Arrays;
import java.util.Collections;

public class RemoveJunkorSpecialCharactersinString {

	public static void main(String[] args) 
	{
		String s = "D#iw@alI";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		
		

	}

}

package RD_Learning;

import java.util.HashSet;
import java.util.Set;

public class Day47DuplicateWordsInString {

	public static void main(String[] args) {
		
		String sentence ="welcome to java welcome parogram program to";
		
		String [] words =sentence.split(" ");
		
		Set unique = new HashSet();
		Set duplicate = new HashSet();
		
		for(String word: words)
		{
			if(!unique.add(word)) 
			{ 
				duplicate.add(word);
			}
		}
		
		System.out.println(duplicate);

		
	}

}

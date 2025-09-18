package RD_Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondRepeatingCharINAString {

	public static void main(String[] args) {
		
		
		String s="programming";
		
		char secondrepeatingchar='\0';
		//int repeatingcount =0;
		
		Map<Character, Integer> charpositions = new HashMap<Character, Integer>();
		List<Character> repeatingcount = new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char currentchar =s.charAt(i);
			if(charpositions.containsKey(currentchar))
			{
				firstrepeatingchar=currentchar;
				break;
				
			}else
			{
				charpositions.put(currentchar, i);
			}
		}
		
		if(secondrepeatingchar!='\0')
		{
			System.out.println("the first repeating char is" + firstrepeatingchar);
		}else
		{
			
		}

	}

}

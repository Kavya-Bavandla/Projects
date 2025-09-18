package RD_Learning;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingCharINAString {

	public static void main(String[] args) {
		
		
		String s="programming";
		
		char firstrepeatingchar='\0';
		
		Map<Character, Integer> charpositions = new HashMap<Character, Integer>();
		
		
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
		
		if(firstrepeatingchar!='\0')
		{
			System.out.println("the first repeating char is" + firstrepeatingchar);
		}

	}

}

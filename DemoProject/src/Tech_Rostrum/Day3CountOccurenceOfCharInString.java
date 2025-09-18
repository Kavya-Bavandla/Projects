package Tech_Rostrum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day3CountOccurenceOfCharInString {

	public static void getCharCount(String name) 
	{
		
		char arr[]=name.toCharArray(); //['w' , 'e' ,'l', 'c' , 'o' , 'm' , e']
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		for(char c:arr)
		{
			if(!String.valueOf(c).isBlank())
			{
				if(charMap.containsKey(c))
				{
					charMap.put(c,charMap.get(c)+1);
				}
				
				else
				{
					charMap.put(c,1);
				}
			}
		}
		
		
		System.out.println(charMap);
	}
	public static void main(String[] args) 
	{
			getCharCount("welcome");
	}

}

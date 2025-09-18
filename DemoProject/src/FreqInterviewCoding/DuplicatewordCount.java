package FreqInterviewCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatewordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="my name is saiteja my name is my my saiteja";
		
		String words [] =str.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String word: words)
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}else
			{
				map.put(word,1);
			}
		}
		
		for(Entry<String, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate element is " +entry.getKey() + "with count" + entry.getValue());
			}
				
		}
	}

}

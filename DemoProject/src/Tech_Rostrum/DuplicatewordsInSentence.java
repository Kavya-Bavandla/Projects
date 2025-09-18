package Tech_Rostrum;

import java.util.HashMap;
import java.util.Map;


public class DuplicatewordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sentence = "I am learning learning java java programming";
		
		String words []= sentence.split(" ");
		
		Map<String, Integer> map= new HashMap<>();
		
		
		for(String word:words)
		{
		
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}else
			{
				map.put(word, 1);
			}
		}
		System.out.println(map);
		
		//duplicate count of words
		
		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + "  " + entry.getValue()+ " " + "times");
			}
		}
		
		
		
		
		

	}

}

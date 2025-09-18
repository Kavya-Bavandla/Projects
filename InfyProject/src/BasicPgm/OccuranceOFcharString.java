package BasicPgm;

import java.util.HashMap;

public class OccuranceOFcharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="Kavya";
		
		char arr[] = s.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<>();
		
		for(char c:arr)
		{
			if(!String.valueOf(c).isBlank())
			{
				if(hashmap.containsKey(c))
				{
					hashmap.put(c, hashmap.get(c)+1);
				}else
				{
					hashmap.put(c,1);
				}
			}
		}System.out.println(hashmap);
		
		
	}

}

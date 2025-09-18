package BasicPgm;

import java.util.HashMap;

public class OccuranceOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Welcome to India welcome to ";
		String s1  = s.toLowerCase();
		String[] s2 = s1.split(" ");
	
		HashMap <String, Integer> hashmap =  new HashMap<>();
		
		for(String s3:s2)
		{
			if(!String.valueOf(s3).isBlank())
			{
				if(hashmap.containsKey(s3))
				{
					hashmap.put(s3, hashmap.get(s3)+1);
				}else
				{
					hashmap.put(s3, 1);
				}
			}
		}System.out.println(hashmap);
		
		

	}

}

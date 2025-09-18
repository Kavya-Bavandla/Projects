package Tech_Rostrum;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="programming";
		
		char [] ch = str.toCharArray();
		
		Set< Character> unique = new HashSet();
		
		
		for(char c:ch)
		{
			if(unique.add(c))
			{
				
			}
		
			
		}System.out.println(unique);
	}

}

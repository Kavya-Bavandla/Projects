package Tech_Rostrum;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueelementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1, 2, 4, 1, 5};
		
		Set <Integer>unique = new HashSet<>();
		Set <Integer>duplicate = new HashSet<>();

		
		for(int l:a)
		{
            // If we can't add to uniqueChars, it's a duplicate

			if(!unique.add(l))
			{
				
				duplicate.add(l);
			}
		}

		unique.removeAll(duplicate);
		System.out.println(unique);
	}

}

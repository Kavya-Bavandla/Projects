package RD_Learning;

import java.util.HashSet;
import java.util.Set;

public class Day41RemoveDuplicatech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
	 String s1="hello to world to hello";
	 
	 String words [] = s1.split(" "); //["hello" , "to" , "world" , "to" , "world"]
	
	 Set unique = new HashSet();
	 
	 for(String word:words)
	 {
		 if(unique.add(word))
		 {
			 
		 }
	 }System.out.println(unique);
	 
	 
	 */
		
		//remove duplicate char from String
		
		String s ="Kavya";
		
		Set unique = new HashSet();
		Set duplicate = new HashSet();

		
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			
			if(!unique.add(ch))
			{
				duplicate.add(ch);
			}
		}

		unique.removeAll(duplicate);
		System.out.println(unique);
		
		
		
		
		
		
		
	 
	}
}

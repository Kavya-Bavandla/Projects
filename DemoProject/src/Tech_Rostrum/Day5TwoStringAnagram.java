package Tech_Rostrum;

import java.util.Arrays;

public class Day5TwoStringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="army";
		String s2="mary";  //ex: stop, tops , length and char are same in both strings they are called anagram
		
		if(s1.length()==s2.length())
		{
		char arr1[]=s1.toLowerCase().toCharArray();
		char arr2[]=s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			
			System.out.println("Anagram");
		}else
		{
			System.out.println("not anagram");
		}
		
		
		}
		
		

	}

}

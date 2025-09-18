package RD_Learning;

import java.util.Arrays;

public class Day35Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String s1="tops";
		String s2="stop";
		
		char arr1 []= s1.toLowerCase().toCharArray();
	
		char arr2 [] =s2.toLowerCase().toCharArray();
		
		if(arr1.length==arr2.length)
		{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	
		if(Arrays.equals(arr1,arr2))
		
		{
			System.out.println("anagram");
		}else
		{
			System.out.println("not anagram");

		}
		}
	}
}

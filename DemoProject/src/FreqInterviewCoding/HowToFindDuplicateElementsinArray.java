package FreqInterviewCoding;

import java.util.HashSet;

public class HowToFindDuplicateElementsinArray {

	public static void main(String[] args) {
		String arr[]= { "Java", "Python" , "Selenium", "psf", "Java", "kbj"};
		/*
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element is : " +arr[i]);
				}
			}
		}*/
		
		
		HashSet <String>langs = new HashSet();
		for(String l: arr)
		{
			//System.out.println(langs.add(l));
			
			if(langs.add(l)==false)
			{
				System.out.println("Duplicate element found" + l);
			}
		}
		

	}

}

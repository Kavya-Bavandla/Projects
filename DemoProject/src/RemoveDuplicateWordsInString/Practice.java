package RemoveDuplicateWordsInString;

import java.util.HashSet;
import java.util.Set;


//1. occurence of char and duplicate count
//2. occurence of words and duplicate count
//3. unique char in sting
//4. unique words in string
//5. vowels and consonants
//6. upper case and lowwecase
//7. Camel casing
//8. Remove special char
//9. common char btwn 2 and 3 char
//10. reverse a string 
//11. second largest 

public class Practice 
{
	
	public static void main(String[] args) 
	{
		 
		int a[]= {12, 10, 13, 14, 14, 9, 4};
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondlargest=a[i];
				a[i]=largest;
			}else if ( a[i]!=secondlargest && largest>a[i])
			{
				secondlargest=a[i];
			}
		}System.out.println(secondlargest);
		
		
		
	}

}

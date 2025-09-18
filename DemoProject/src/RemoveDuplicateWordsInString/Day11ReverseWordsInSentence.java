package RemoveDuplicateWordsInString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day11ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//common elements btwn 2 array
		
		
		int a[]= {1, 4, 5, 2, 9};
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]>a[j]))
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
				
			}
		}
		System.out.println(Arrays.toString(a));

	}

}

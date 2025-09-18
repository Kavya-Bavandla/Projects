package RemoveDuplicateWordsInString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//common elements btwn 2 array
		
		
		int a[]= {1, 4, 5, 2, 9};
		int b[]= {11, 10, 12, 14, 13, 13};
		
		int merged [] =new  int[a.length+b.length];
		
		
		for(int i=0;i<a.length;i++)
		{
			merged[i]=a[i];
			
		}for(int i=0;i<b.length;i++)
		{
			merged[a.length+i]=b[i];
		}
		System.out.println(Arrays.toString(merged));

	}

}

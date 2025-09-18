package FreqInterviewCoding;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) 
	{
		/*
		 int a[]= {2, 1, 3, 5, 4};
		 
		
		int n =a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0; j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}System.out.println(Arrays.toString(a));
		
		*/
		
		
		/*
		int a[]= {2, 1, 3, 5, 4};
		System.out.println("Arrays before sorting : "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Arrays after sorting : "+Arrays.toString(a));
		
		//Arrays after sorting : [1, 2, 3, 4, 5]
		//rev
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
			
		}
		*/
		
		//TO get reverse order
		
		Integer a[]= {2, 1, 3, 5, 4};
		Arrays.sort(a, Collections.reverseOrder());
		
		
		

	}

}

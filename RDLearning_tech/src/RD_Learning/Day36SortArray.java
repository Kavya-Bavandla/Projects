package RD_Learning;

import java.util.Arrays;

public class Day36SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int a [] = {1, 4, 6, 2, 3};
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a); //[I@5ca881b5
		System.out.println(Arrays.toString(a));
	}
}

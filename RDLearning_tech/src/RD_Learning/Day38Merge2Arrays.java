package RD_Learning;

import java.util.Arrays;

public class Day38Merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int arr1[] = {12, 13, 14, 15};
		int arr2[] = {5, 4};

		int merge[] = new int [arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			merge[i] =arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			merge[arr1.length+	i] =arr2[i];
		}
		
		System.out.println(Arrays.toString(merge));
		
	}
}

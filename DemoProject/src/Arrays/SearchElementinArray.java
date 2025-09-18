package Arrays;

import java.util.Scanner;

public class SearchElementinArray {

	public static void main(String[] args) {

		int a[]= new int[4];
		Scanner sc = new Scanner (System.in);
		
        // 1. Input array values
		System.out.println("Enter the array values");
		 for(int i = 0; i < a.length; i++) 
		 {
	            a[i] = sc.nextInt();
	     }
	        
		
	    // 2. Input search element

		System.out.println("Enter the search element");
		int serachElement =sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			if(serachElement==a[i])
			{
				found=true;
				System.out.println("Element found");
				break;
			}
		}
		
		if(found=false)
		{
            System.out.println("Element not found in the array");

		}

	}

}

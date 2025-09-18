package FreqInterviewCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElementInstagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the target element");
		int num=sc.nextInt();
		
		int a[]= {1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9};
		
		
		List<Integer> arr= new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				arr.add(i);
			}
		}
		//System.out.println(arr);
		if(!arr.isEmpty())
		{
			System.out.println("Given number is" + num + "found at :");
			for(int index:arr)
			{
				System.out.println(index + " ");
			}
		}else
		{
			System.out.println("Given number is" + num + "is not found ");
		}
	}

}

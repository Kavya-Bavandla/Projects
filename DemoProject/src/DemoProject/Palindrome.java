package DemoProject;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		int rev=0, temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num= sc.nextInt();
		int rev1=num;
		while(num>0)
		{
			//temp = num%10;
			rev= (rev*10)+(num%10);
			num=num/10;
			
		}
		if(rev==rev1)
		{
		System.out.println("given number is palindrome");

		}else
		{
			System.out.println("given number is NOT palindrome");
		}

	}
}

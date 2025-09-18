package FreqInterviewCoding;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		int num =sc.nextInt();
	
		int temp=0, rev=0, s=num;
		while(num>0)
		{
			temp=num%10;
			rev=(rev*10)+temp;
			num=num/10;
		}
		if(s==rev)
		{
			System.out.println("Given number is  palindrome");
		}else
		{
			System.out.println("Given number is NOT palindrome");

		}
		
	}

}

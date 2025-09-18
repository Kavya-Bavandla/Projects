package FreqInterviewCoding;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed");
		
		String s=sc.next();
		
		String s1="";
		String rev=s;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		if(rev.equals(s1))
		{
			System.out.println("given string is palindrome");
		}else
		{
			System.out.println("given string is NOT palindrome");
		}

	}

}

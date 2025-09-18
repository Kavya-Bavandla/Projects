package DemoProject;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) 
	{
		int rev=0, temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		
		
		while(!sc.hasNextInt()) //checks if the entered number is integer or not
		{
			System.out.println("Enter the valid number");
			sc.next(); //clears the invalid data 
		}
		
		int num=sc.nextInt();
		boolean isNegative = num<0;
		
		if(isNegative)
		{
			num=-num;
		}
		
		if(num==0)
		{
			System.out.println("Reversed number: 0");
			return;
		}
		
		 if (isNegative) {
	            rev = -rev;
	        }
		
		while(num>0)
		{
			temp = num%10;
			rev= (rev*10)+temp;
			num=num/10;
			
		}
		System.out.println(rev);

		

	}
}

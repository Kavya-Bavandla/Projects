package Arrays;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		int  count=0;
		
		
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				
				}
			}if(count==2)
			{
				System.out.println("Prime  number");
			}else
			{
				System.out.println("Not Prime  number");
			}
		}
		
		
		else
		{
			System.out.println("given number is NOT  prime");
		}
		

	}

}

package DemoProject;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		
		if(!sc.hasNextInt())
		{
			System.out.println("Enter the valid number");
			sc.nextInt();
		}
		
		int num=sc.nextInt();
		
		int temp=0,sum=0;
		while(num>0)
		{
			temp= num%10;
			sum= sum+temp;
			num=num/10;
			
		}
		System.out.println("The sum of given number is : " +sum);
	}

}

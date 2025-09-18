package DemoProject;

import java.util.Scanner;

public class CountNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=0,count=0;
		while(num>0)
		{
			temp= num%10;
			num=num/10;
			count++;
			
		}
		System.out.println("the count of given number is  :" +count);
		
	}

}

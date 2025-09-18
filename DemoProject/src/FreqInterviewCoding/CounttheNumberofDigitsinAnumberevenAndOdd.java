package FreqInterviewCoding;

import java.util.Scanner;

public class CounttheNumberofDigitsinAnumberevenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=0,counteven=0, countodd=0;
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			if(temp%2==0)
			{
				counteven++;
				
			}else
			{
				countodd++;
				
			}
			
		}System.out.println("Even and Odd numbers count is :" +counteven+ "  " +countodd);

	}

}

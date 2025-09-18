package FreqInterviewCoding;

import java.util.Scanner;

public class CounttheNumberofDigitsinAnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=0,count=0;
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			if(temp>0)
			{
				count++;
			}
			
		}System.out.println("the number of digits in a given number is : " + count);

	}

}

package FreqInterviewCoding;

import java.util.Scanner;

public class CounttsumofgivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=0,sum=0;
		while(num>0)
		{
			temp=num%10;
			sum=sum+temp;
			num=num/10;
	
			
		}System.out.println("the sum of digits in a given number is : " + sum);

	}

}

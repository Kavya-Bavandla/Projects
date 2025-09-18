package RD_Learning;

import java.util.Scanner;

public class CheckGivenInputisInteger {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		
		
		if(sc.hasNextInt() || sc.hasNextDouble())
		{
			System.out.println("INPUT IS NUM");
		}else
		{
			System.out.println("input isno tint");
		}
				
	}

}

package RD_Learning;

import java.util.Scanner;

public class Day50CheckUserInputIsNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		String num = sc.next();

		try {
			Integer i = new Integer(num);
			System.out.println("Given INteger : " + i);

		} catch (Exception e) {
			System.out.println("Given Input is not Integer" + num);
		}

	}
}

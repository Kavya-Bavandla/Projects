package DemoProject;

import java.util.Scanner;

public class Dayofweek {

	public static void main(String[] args) {
		// Write a program that takes a number (1-7) and prints the corresponding day of
		// the week.

		/*
		 * Scanner sc= new Scanner(System.in);
		 * System.out.println("Enter the week number"); int weekno = sc.nextInt();
		 * 
		 * switch(weekno) { case 1: System.out.println("Sunday"); break; case 2:
		 * System.out.println("Monday"); break; case 3: System.out.println("tues");
		 * break; case 4: System.out.println("wed"); break; case 5:
		 * System.out.println("thru"); break; case 6: System.out.println("fri"); break;
		 * case 7: System.out.println("sat"); break; 
		 * default: System.out.println("invalid weekno"); break;
		 * 
		 * }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week day");
		String weekday = sc.next();
		String w = weekday.toLowerCase();

		switch (w) {
		case "sunday":
			System.out.println("1");
			break;
		case "Monday":
			System.out.println("2");
			break;
		case "tuesday":
			System.out.println("3");
			break;
		default:
			System.out.println("Invalid day");

		}

	}

}

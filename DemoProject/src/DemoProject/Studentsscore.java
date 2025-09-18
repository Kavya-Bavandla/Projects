package DemoProject;

import java.util.Scanner;

public class Studentsscore {

    public static void main(String[] args) {
        // Grade Calculator: Write a program that takes a student's score and prints their grade (A, B, C, D, F) based on predefined ranges.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int result = sc.nextInt();
        
        //100-90 ----> A
        //89-80 -----> B
        //79-70 -----> C
        //69-60 -----> D
        //59-0 -----> F
        
        if(result > 100 || result < 0) {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        } else if(result >= 90) {
            System.out.println("The Grade of the student is 'A'");
        } else if(result >= 80) {
            System.out.println("The Grade of the student is 'B'");
        } else if(result >= 70) {
            System.out.println("The Grade of the student is 'C'");
        } else if(result >= 60) {
            System.out.println("The Grade of the student is 'D'");
        } else {
            System.out.println("The Grade of the student is 'F'");
        }
    }
}
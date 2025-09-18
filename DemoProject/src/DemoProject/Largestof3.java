package DemoProject;

import java.util.Scanner;

public class Largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        
        // Find the largest number
        if(a >= b && a >= c) {
            System.out.println("a is greatest: " + a);
        } 
        else if(b >= a && b >= c) {
            System.out.println("b is greatest: " + b);
        }
        else {
            System.out.println("c is greatest: " + c);
        }
        
        sc.close(); // Close the scanner
    }
}
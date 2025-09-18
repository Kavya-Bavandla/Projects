package DemoProject;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);
        
        // Convert to lowercase to simplify checking
        char lowerCh = Character.toLowerCase(ch);
        
        if (lowerCh >= 'a' && lowerCh <= 'z') 
        {  // Check if it's a letter
           
        	if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') 
        	{
                System.out.println(ch + " is a vowel.");
            } 
        	else 
        	{
                System.out.println(ch + " is a consonant.");
            }
        } 
        else 
        {
            System.out.println(ch + " is not a letter.");
        }
        
        scanner.close();
    }
}
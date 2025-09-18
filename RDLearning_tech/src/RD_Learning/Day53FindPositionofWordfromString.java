package RD_Learning;

import java.util.Scanner;

public class Day53FindPositionofWordfromString {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String"); //welcome to java
		String sentence =sc.nextLine();
		System.out.println("Enter the word");
		String word =sc.next(); //welcome
		
		String[] words =sentence.split(" "); //["welcome", "to", "java"]
		
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(word))
			{
				System.out.println("the index of given word is :" +i);
			}
		}


		

	}

}

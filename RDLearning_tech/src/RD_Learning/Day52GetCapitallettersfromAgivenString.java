package RD_Learning;

import java.util.Scanner;

public class Day52GetCapitallettersfromAgivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence =" tHe World TO nICe";
		
		String [] words =sentence.split(" "); //["the" ,"World" , "TO" , "nICe"]
		
		for(int i=0; i<words.length;i++)
		{
			String word= words[i]; //the
			
			for(int j=0; j<word.length();j++)
			{
				char ch =word.charAt(j);
							
				if(ch>='A' && ch<='Z')
				{
					System.out.print(ch);
				}
			
				
			}
		}
	}

}

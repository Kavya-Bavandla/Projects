package RD_Learning;

import java.util.Scanner;

public class Day49FindSubStringofGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Automation";
		
		String word ="mat";
		
		boolean flag=false;
		for(int i =0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
					String sub =s.substring(i,j); //we get all possibilites of substrings
					if(sub.equals(word))
					{
						flag=true;
					}
			}
			
		}
		if(flag==true)
		{
			System.out.println("substring contains in main string");
		}else
		{
			System.out.println("substring NOT contains in main string");
		}
	}

}

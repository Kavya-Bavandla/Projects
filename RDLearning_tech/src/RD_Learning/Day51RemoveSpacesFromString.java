package RD_Learning;

import java.util.Scanner;

public class Day51RemoveSpacesFromString {

	public static void main(String[] args)
	{
		
		String s = "remove spaces from String";
		
		String origin =s.replaceAll("\\s+" , "");
		
		System.out.println(origin);

		

	}

}

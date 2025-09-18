package RD_Learning;

import java.util.Arrays;

public class Class 
{

	public static void main(String[] args) 
	{
		
		String s1="tops";
		String s2="stop";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		if(ch1.length==ch2.length)
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);

		}

	}

}

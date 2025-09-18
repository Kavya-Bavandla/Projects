package RD_Learning;

import java.util.Scanner;


public class PrintABCDtoAABBCCDD {

	public static void main(String[] args) {
		
		
		
		String s ="ABCD";
		
		StringBuffer res = new StringBuffer();
		
		
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			res=res.append(c).append(c);
		}System.out.println(res);
	}

}

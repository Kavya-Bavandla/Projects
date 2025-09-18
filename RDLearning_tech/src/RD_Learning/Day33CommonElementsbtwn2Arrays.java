package RD_Learning;

import java.util.Arrays;

public class Day33CommonElementsbtwn2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		int a[]= {1, 3, 4, 2};
		int b[]= {3, 2, 6, 7};
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		*/
		
		
		String s1="Kavya";
		String s2="Teja";
		
		char ch[] =s1.toLowerCase().toCharArray();
		
		for(char c:ch)
		{
			if( s2.toLowerCase().contains(String.valueOf(c)))
		
			{
				System.out.println(c);
			}
		}
		
		
		
		
		
		
	}
}

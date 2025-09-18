package RD_Learning;

import java.util.Arrays;

public class Day34RemoveElementFromGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[]= {1, 3, 4, 2};
		
		int b[]= new int[a.length-1];
		int elemtremove =2;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=elemtremove)
			{
				b[i]=b[i]+a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}

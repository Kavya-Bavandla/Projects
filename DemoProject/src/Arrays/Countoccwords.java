package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Countoccwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "armamiaioroy is the best ";
		
		String [] arr= s1.split(" ");
	
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}

	}

}

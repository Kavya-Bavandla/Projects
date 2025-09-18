package Arrays;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1, 4, 5, 3};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); //[1, 3, 4, 5]
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]>1)
			{
				for(int j=a[i]+1;j<a[i+1];j++)
				{
					System.out.println("Element missed is :" +j);
				}
						
						
			}
		}
	}

}

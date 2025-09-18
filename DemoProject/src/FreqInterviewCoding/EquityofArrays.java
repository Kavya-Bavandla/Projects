package FreqInterviewCoding;

import java.util.Arrays;

public class EquityofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 3, 5 };

		
		 /* App: 1 
		  boolean b = Arrays.equals(a1, a2);
		  
		  if(b==true) { System.out.println("Arrays are equal"); }else {
		  System.out.println("Arrays are NOT  equal"); }
		 
		 */
		
		//app2:
		
		boolean status = true;
		if(a1.length==a2.length)
		{
			for(int i =0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status =false;
				}
			}
			
		}
		else
		{
			status = false;
		}
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}else
		{
			System.out.println("Arrays are NOT equal");
		}

	}

}

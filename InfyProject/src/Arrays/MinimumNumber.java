package Arrays;

public class MinimumNumber {

	public static void main(String[] args) {
	
		
		int a []= {3,2,1,4,0, 5};
		for(int i=0;i<a.length-1;i++)
		{	
			if(a[i]<a[i+1])
			{
				System.out.println(a[i]);
				
			}
	
		}

	}

}

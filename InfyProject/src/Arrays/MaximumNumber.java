package Arrays;

public class MaximumNumber {

	public static void main(String[] args) {
	
		
		int a []= {1, 4, 21, 34, 3};
		for(int i=0;i<a.length-1;i++)
		{	
			if(a[i]>a[i+1])
			{
				System.out.println(a[i]);
				
			}
	
		}

	}

}

package Tech_Rostrum;

public class Day13FindLargestAndSmmalestELementInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a[] = {12, 23, 352, 1324, 5, 6, 2, 4, 1, 2};
		
		int largest = a[0];
		int smallest =a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}else if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("Largest number in the array is : "+largest);
		System.out.println("Largest number in the array is : "+smallest);
	}

}

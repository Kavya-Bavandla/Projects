package Arrays;

public class SumofElementsInanArray {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 5, 9};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number " +a[i]);
			}
			else
			{
				System.out.println("Odd number" +a[i]);
			}
			
			
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}

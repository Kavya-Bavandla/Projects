package FreqInterviewCoding;

public class SumofElementsinArray {

	public static void main(String[] args) {
		int a[] = {2, 43, 52, 1, 3}, sum=0;
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even element in Array is :" +a[i]);
			}
			else
				System.out.println("ODd element in Array is :" +a[i]);
			
		}
		

	}

}

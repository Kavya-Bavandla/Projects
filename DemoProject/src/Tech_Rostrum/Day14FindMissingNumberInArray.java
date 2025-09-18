package Tech_Rostrum;

public class Day14FindMissingNumberInArray {

	public static void main(String[] args) {
	
		
		int a[]= {1, 2,3 ,4, 5, 6, 7, 8, 10};
		
		int sum=0;
		int expectedsum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}

		for(int i=0;i<11;i++)
		{
			expectedsum=expectedsum+i;
		}
		
		
		int resu = expectedsum-sum;
		System.out.println(resu);
		
	}

}

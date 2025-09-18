package FreqInterviewCoding;

public class FindMissingNumberinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1, 2, 4, 5}, sum1=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		
		int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Missin number is :  "+ (sum2-sum1));

	}

}

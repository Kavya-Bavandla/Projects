package FreqInterviewCoding;

public class FibonaciSeries {

	public static void main(String[] args) 
	{
	// 0  1  1  2  3  5 
	// F0 F1 F2 F3 F4 F5
		
		
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2+ " ");
		for(int i=2;i<=5;i++)
		{
			sum=n1+n2;
			System.out.print(" " +sum);
			n1=n2;
			n2=sum;
			
		}
		
		

	}

}

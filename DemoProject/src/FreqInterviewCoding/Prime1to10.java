package FreqInterviewCoding;

public class Prime1to10 {

	public static void main(String[] args) 
	{
		int i=0, j=0, count =0;
		for(i=1; i<=10;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				count++;
			}
		
			if(count==2)
			{
				System.out.println("prime" + i);
			}else
			{
				System.out.println("Not prime" + i);
			}
		}
	
	}

}

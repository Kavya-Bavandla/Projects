package RD_Tech;

public class R5_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=6,count =0;
		
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("PRIME ");
		}else
		{
			System.out.println("not PRIME ");
		}
		
		
	}

}

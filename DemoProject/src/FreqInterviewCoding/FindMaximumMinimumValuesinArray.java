package FreqInterviewCoding;

public class FindMaximumMinimumValuesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {12, 14, 10, 30, 16};
		
		/*int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}System.out.println(max);
		
		*/
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}System.out.println(min);
	}

}

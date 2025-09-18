package FreqInterviewCoding;

public class FactorialofGivenNumber {

	public static void main(String[] args) {
		
		int factnum=5; 
		long factorial =1;
		for(int i =1; i<=factnum;i++)
		{
			factorial = factorial *i;
		}
		System.out.println(factorial);
	}

}

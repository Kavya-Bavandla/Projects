package BasicPgm;

public class ReverseAnumber {

	public static void main(String[] args) {
		
		int num = 123, temp=0, rev=0;
		
		while(num>0)
		{
			temp = num%10;
			rev = (rev*10) + temp;
			num =num/10;
		}System.out.println(rev);

	}

}

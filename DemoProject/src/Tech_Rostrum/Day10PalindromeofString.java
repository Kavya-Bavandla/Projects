package Tech_Rostrum;

public class Day10PalindromeofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S="madam",rev=S;
		String s1="";
		for(int i=S.length()-1;i>=0;i--)
		{
			s1=s1+S.charAt(i);
		}
		System.out.println(s1);
		
		if(rev.equals(s1))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}

	}

}

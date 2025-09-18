package BasicPgm;

public class CheckVowelPresentOrNot {
	
	public static void main(String[] args)
	{
		String s="Kvy";
		boolean status =false;
		
		for(int i =0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch == 'o' || ch=='u')
			{
				status=true;
			}
		}if(status==true)
		{
			System.out.println("vowel is present");
		}else
		{
			System.out.println("vowel is NOT present");
		}
	}

}

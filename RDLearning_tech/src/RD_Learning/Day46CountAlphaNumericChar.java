package RD_Learning;

public class Day46CountAlphaNumericChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="test$123:";
		String s1 ="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
			{
				s1=s1+ch;
				
				
			}else 
			{
				continue;
			}
		}System.out.println(s1.length());
	}

}

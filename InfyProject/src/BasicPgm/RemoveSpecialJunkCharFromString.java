package BasicPgm;

public class RemoveSpecialJunkCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="#K%a&v7ss";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				s1=s1+ch;
			}
		}System.out.println(s1);
		

	}
	

}

package Learning;

public class PG2FindVowelsInAstring {

	public static void main(String[] args) {
		
		
		
		String s ="Kavya";
	
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(ch == 'a' || ch == 'i' || ch =='o' || ch == 'u' || ch =='e')
			{
					System.out.println("the vowels in the given string are :" + ch);
			}
		}

	}

}

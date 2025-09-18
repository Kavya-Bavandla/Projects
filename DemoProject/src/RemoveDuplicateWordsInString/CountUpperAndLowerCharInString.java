package RemoveDuplicateWordsInString;

public class CountUpperAndLowerCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="The world is So good TToDDay whilE";
		
		int Uppercount =0;
		int Lowercount=0;
		
		String upperch="";
		String lowerch="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<=90)
			{
				Uppercount++;
				upperch=upperch+ch;
				
			}else if(ch >='a' && ch<='z')
			{
				Lowercount++;
				lowerch=lowerch+ch;
			}
			
		}System.out.println("Upper chars are :" +upperch + "       with count      " +Uppercount );
		System.out.println("Lower chars are :" +lowerch + "     with count       " +Lowercount );


	}

}

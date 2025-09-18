package RemoveDuplicateWordsInString;

public class Day12ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="How are you";
		
		String result= "";
		String [] arr = s.split(" ");
		
		String rev="";
		for(String word:arr)
		{
			
			for(int i=word.length()-1;i>=0;i--)
			{
				char ch =word.charAt(i);
				rev=rev+ch;
			}
		}
		
		result=result + " "+rev;
		System.out.println(result);

	}

}

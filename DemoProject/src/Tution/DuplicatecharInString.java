package Tution;

public class DuplicatecharInString {

	public static void main(String[] args) {
		String s = "Ball";
		int count = 0;
		char ch[] = s.toCharArray();

		boolean status = false;
		for (int i = 0; i < ch.length; i++)
		{
			count=0;
			for (int j = i+1; j < ch.length; j++) 
			{
				if (ch[i] == ch[j]) 
				{
					status=true; 
				
					System.out.println("the duplicate char is : "+ ch[i] );
					
				}
			}
			
		}
		if(status==false)
		{
			System.out.println("there are no duplicates");
		}

	}

}

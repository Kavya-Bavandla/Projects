package Tution;

public class DuplcaiteChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="programming";
		
		for(int i = 0; i<s.length(); i++)
		{
			int count=0;
			for(int j=i+1; j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					
				{
					count ++;
					System.out.println("Duplciate char are :" +s.charAt(i));
				}
			}if(count>0)
			{
				System.out.println(count+1);
			}
		}

	}

}

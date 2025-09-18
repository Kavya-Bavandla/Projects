package RemoveDuplicateWordsInString;

public class Day9First4charFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= new String("www.erostrum.com");
		
		String first4=s.substring(0,4);

		System.out.println(first4);
		
		
		//last four
		//System.out.println(s.length()); //16
		String lastfour =s.substring(s.length()-4, 16);
		System.out.println(lastfour);
		
		
		//middle
		String middlefour =s.substring(4, s.length()-4);
		System.out.println(middlefour);
		
		/*	
		 
		What is String Immutability?

				In Java, String objects are immutable - once created, their content cannot be changed

				Any operation that appears to modify a string actually creates a new string object

				What Happens in Your Code

				s1.substring(0,4) creates a brand new String containing "Indi"

				The original string s1 remains completely unchanged

				The new string is what gets printed
				*/
		
	}

}

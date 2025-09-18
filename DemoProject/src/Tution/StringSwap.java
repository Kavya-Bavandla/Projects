package Tution;

public class StringSwap {

	public static void main(String[] args) {

		String s1= "Hello";
		String s2="World";
		
		
		/*
		String res=s1+s2; //Kavyateja
				
		s2= res.substring(0, res.length()-4);
		s1 = res.substring(res.length()-4, res.length());
		
		System.out.println(s1 + "  "+s2);
		*/
		
		
		s1=s1+s2; //s1 = HelloWorld 
		
		s2= s1.substring(0, s1.length()-s2.length()); 
		
		 //s2 = hello
		
		s1 =s1.substring(s2.length()); //s1 =World
		
		System.out.println("s1 value is :" +s1 );
		System.out.println("s2 value is :" +s2 );


	}

}

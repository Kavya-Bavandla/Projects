package Tution;

public class StartLetterCap_LastLetterLower {

	public static void main(String[] args) {

		String s1= "hello";
		
		
		String first = s1.substring(0,1).toUpperCase(); //H

		String last = s1.substring(s1.length()-1,s1.length()).toUpperCase();  //O
		
		
		
		String middle= s1.substring(1, s1.length() - 1);
		
		String str =first+middle+last;

		System.out.println(str);
		

	}

}

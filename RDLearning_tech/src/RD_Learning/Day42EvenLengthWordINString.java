package RD_Learning;

public class Day42EvenLengthWordINString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	 String s1="hello to world";
	 
	 String words [] = s1.split(" "); //["hello" , "to" , "world"]
	
	 for(int i=0;i<words.length;i++)
	 {
		 if(i%2==0)
		 {
			 System.out.println(words[i]);
		 }
	 }
	 
	 
	}
}

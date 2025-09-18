package FreqInterviewCoding;

public class Swappingof2numbers {

	public static void main(String[] args) {
		 int a=2, b=3;
		 System.out.println("Before swaping the values are : " + a +"  " + b);
		 a=b+a; //a=5
		 b=a-b; //b=5-3=2
		 a=a-b; //a=2-5=3
		 System.out.println("After swaping the values are : " + a +"  " + b);

		 
		 b=a+b-(a=b); //single statement
		 
		 
	}

}

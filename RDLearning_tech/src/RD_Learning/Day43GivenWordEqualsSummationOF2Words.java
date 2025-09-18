package RD_Learning;

public class Day43GivenWordEqualsSummationOF2Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GivenWordEqualsSummationOF2Words

	 String s1="hello";
	 String s2="world";
	 String s3="helloworld";
	
	 
	 String res =s1.concat(s2);
	 
	 System.out.println(res); //helloworld
	 
	 boolean flag =res.equals(s3);
	 System.out.println(flag);
	 
	 if(flag==true)
	 {
		 System.out.println("equals");
	 }else
	 {
		 System.out.println("not equals");

	 }
	 
	}
}

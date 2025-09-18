package Tution;


class HDFC 
{
		static void m1()
		{
			System.out.println("m1 method of parent");
		}
}

public class Bank extends HDFC
{
	static void m1()
	{
	
		System.out.println("m1 method of child");
	}
	
	public static void main(String[] args) 
	{
		
		HDFC b = new Bank();
		b.m1();
		
		
	}

}

package BasicPgm;
interface I1
{
	void m4();
}

abstract class A implements I1
{
	int a;
	

	abstract void m1();
	void m2()
	{
		System.out.println("non abstract class");
	}
	static void m3()
	{
		System.out.println("non abstract class");
	}
	
	public void m4() 
	{
		
	}
}
public class AbstractClass extends A
{

AbstractClass(int a)
{
	System.out.println("a is var");
	}
	public static void main(String[] args)
	{
		
		
		//AbstractClass ab= new AbstractClass();
		
		AbstractClass ab1= new AbstractClass(10);
		ab1.m1();
		ab1.m2();
		m3();
		System.out.println(ab1.a);
		
		//A a = new AbstractClass();------>
		
	}

	@Override
	void m1() {
		System.out.println("ths is overidden abstract method");
		
	}

}

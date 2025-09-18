package Tution;

class Animal
{
	int a=10;
	public  Animal()
	{
		System.out.println("parent const");
	}
	public void bark()
	{
		System.out.println("Animal is barking" + a);
	}
}
public class Dog extends Animal 
{

	public Dog()
	{
		System.out.println("child con");
	}

	
	public static void main(String[] args) {
		

		Dog d = new Dog();
		d.bark();
		
	}

}

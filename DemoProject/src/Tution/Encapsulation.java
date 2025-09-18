package Tution;

public class Encapsulation {
	
	
	private String name;
	private int rollNo;
	private char Grade;
	
	
	public void setName(String n) {
		name=n;
	}
	public void setRollNo(int r) {
		rollNo=r;
	}
	public void setGrade(char c)
	{
		Grade=c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getrollNo()
	{
		return rollNo;
	}
	public char getGrade()
	{
		return Grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e = new Encapsulation();
		e.setName("kavya");
		e.setRollNo(12);
		e.setGrade('a');
		e.getName();
		
		
		
	}

}

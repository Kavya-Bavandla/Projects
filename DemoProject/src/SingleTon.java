


public class SingleTon 
{
	
	private static SingleTon instance;
	
	private SingleTon()
	{
		
	}
	
	public static SingleTon getInstance()
	{
		if(instance==null)
		{
			instance = new SingleTon();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
		SingleTon m = SingleTon.getInstance();
		SingleTon m1 = SingleTon.getInstance();
	}

}

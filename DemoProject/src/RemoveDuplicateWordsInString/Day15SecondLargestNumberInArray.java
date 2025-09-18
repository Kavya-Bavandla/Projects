package RemoveDuplicateWordsInString;

public class Day15SecondLargestNumberInArray {

	public static void main(String[] args) {
		int [] numbers = {23, 12, 9, 42, 20};
		
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		
		for(int num:numbers)
		{
			if(num<smallest)
			{
				secondsmallest=smallest;
				smallest=num;
			}else if(num<secondsmallest && num!=smallest)
			{
				secondsmallest=num;
			}
		}
		
		if(secondsmallest!=Integer.MAX_VALUE)
		{
			System.out.println("second smallest :" +secondsmallest);
		}else
		{
			System.out.println("Secondsmallest doesnt exists");
		}
	}

}

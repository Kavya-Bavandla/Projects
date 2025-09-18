package RD_Learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day39ArrayIsSubsetofAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int arr1[] = {12, 13, 14, 15};
		int arr2[] = {5, 4};
		
		List<Integer> arrone = new ArrayList();
		List<Integer> arrtwo= new ArrayList();

		
		for(int i=0;i<arr1.length;i++)
		{
			arrone.add(i);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arrtwo.add(i);
		}
		
		
		if(arrone.containsAll(arrtwo))
		{
			System.out.println("yes ");
		}else
		{
			System.out.println("no");
		}
	}
}

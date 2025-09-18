package FreqInterviewCoding;

public class SearchinganElementinArray_LinearSearch {

	public static void main(String[] args) {
		int a[]= {10, 20, 30, 40, 50};
		int search_element=60;
		boolean status =false;
		for(int i=0;i<a.length;i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element found at : " + i + "position");
				status=true;
				break; 
			}
		}
		if(status==false)
		{
			System.out.println("ELEment not found");
		}

	}

}

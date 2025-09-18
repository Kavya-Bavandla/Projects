package RemoveDuplicateWordsInString;

public class FindDuplicatesCharInString {
    public static void main(String[] args) {
    	
    	
        String s ="programming";
        
        boolean []visited =new boolean[256];
        
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);
        	if(visited[ch]==true)
        	{
        		System.out.println(ch);
        	}else
        	{
        		visited[ch] = true;
        	}
        }
        
        
    }
}
package Tech_Rostrum;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicatesAndCharcount 
{
    public static void main(String[] args) 
    {
        String s = "programming";
        
        char ch[]= s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c:ch)
        {
        	if(map.containsKey(c))
        	{
        		map.put(c, map.get(c)+1);
        	}else
        	{
        		map.put(c,1);
        	}
        }
        
        System.out.println( map);
        		
        for(Entry<Character, Integer> entry : map.entrySet())
        {
        	if(entry.getValue()>1)
        	{
        		System.out.println(entry.getKey() + "     "+ entry.getValue() + "Times");
        	}
        }
    }
}
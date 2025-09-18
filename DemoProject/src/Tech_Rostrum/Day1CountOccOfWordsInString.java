package Tech_Rostrum;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day1CountOccOfWordsInString {

	//1. 1. Count occurrences of each word
	//2. duplciate  of words and count
	//3. remove duplicates
	
    public static void main(String[] args) {
       
        String sentence = "I am learning learning java java programming";
        
        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" "); //["I", "am", "learning", "learning", "java", "java", "programming"]
        
        // Create a HashMap to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();
        
        //1. Count occurrences of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                // If word exists, increment count
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                // If new word, add to map with count 1
                wordCounts.put(word, 1);
            }
        }System.out.println(wordCounts);
        
        
        //2. to find the duplciate count
        for(Entry<String, Integer> entry: wordCounts.entrySet())
        {
        	if(entry.getValue()>1)
        	{
        		System.out.println(entry.getKey() + "count" + entry.getValue() + "times");
        	}
        }
        
        
        
        //3. remove duplicates
        
        Set<String> uniqueWords = new LinkedHashSet<>(); // Preserves insertion order
        for (String word : words) 
        {
            uniqueWords.add(word);
        }System.out.println(uniqueWords);
       
    }
}
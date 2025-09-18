package RemoveDuplicateWordsInString;

import java.util.HashMap;
import java.util.Map;

public class Day1CountOccOfWordsInString {

    public static void main(String[] args) {
        // Input sentence
        String sentence = "I am learning learning java java programming";
        
        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" "); //["I", "am", "learning", "learning", "java", "java", "programming"]
        
        // Create a HashMap to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();
        
        // Count occurrences of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                // If word exists, increment count
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                // If new word, add to map with count 1
                wordCounts.put(word, 1);
            }
        }System.out.println(wordCounts);
        
       
    }
}
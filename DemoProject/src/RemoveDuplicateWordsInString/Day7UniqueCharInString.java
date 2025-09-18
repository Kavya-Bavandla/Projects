package RemoveDuplicateWordsInString;

import java.util.HashSet;
import java.util.Set;

public class Day7UniqueCharInString {

    public static void main(String[] args) {
        String s1 = "banana";
        
        // To store unique characters
        Set<Character> uniqueChars = new HashSet<>();
        // To store duplicate characters
        Set<Character> duplicateChars = new HashSet<>();
        
        char[] arr = s1.toCharArray();
        
        for (char c : arr) {
            // If we can't add to uniqueChars, it's a duplicate
            if (!uniqueChars.add(c)) {
                duplicateChars.add(c);
            }
        }
        
        // Remove all duplicates from uniqueChars
        uniqueChars.removeAll(duplicateChars);
        
        System.out.println("Unique characters: " + uniqueChars);
    }
}
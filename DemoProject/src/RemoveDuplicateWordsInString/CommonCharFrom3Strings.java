package RemoveDuplicateWordsInString;

import java.util.HashSet;
import java.util.Set;

public class CommonCharFrom3Strings {

    public static void main(String[] args) {
        String s1 = "Ram";
        String s2 = "Raj";
        String s3 = "Rock";
        
        Set<Character> commonChars = new HashSet<>();
        
        // Find common between s1 and s2 first
        for (char c : s1.toLowerCase().toCharArray()) {
            if (s2.toLowerCase().contains(String.valueOf(c))) {
                commonChars.add(c);
            }
        }
        
        // Then check which of those are in s3
        System.out.println("Common characters:");
        for (char c : commonChars) {
            if (s3.toLowerCase().contains(String.valueOf(c))) {
                System.out.println(c);
            }
        }
    }
}
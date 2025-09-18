package Tech_Rostrum;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] a = {4, 1, 1, 4, 2, 2, 2, 1, 5, 7, 5};
        
        System.out.println("Duplicate elements:");
        
        // Create an array to mark visited elements
        boolean[] visited = new boolean[a.length];
        
        for (int i = 0; i < a.length; i++) 
		{
            // Skip if already marked as duplicate
            if (visited[i]==true) {
                continue;
            }
            
            boolean isDuplicate = false;
            
            // Check all following elements
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true; // Mark as visited
                    isDuplicate = true;
                }
            }
            
            // Print if duplicate found
            if (isDuplicate==true) {
                System.out.println(a[i]);
            }
        }
    }
}
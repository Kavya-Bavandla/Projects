package RemoveDuplicateWordsInString;

public class FindDuplicatesWithCount {
    public static void main(String[] args) {
        int[] a = {4, 1, 1, 4, 2, 2, 2, 1, 5, 7, 5};
        
        System.out.println("Duplicates with counts:");
        
        boolean[] visited = new boolean[a.length];
        
        for (int i = 0; i < a.length; i++) {
            if (visited[i]) continue;
            
            int count = 1;
            
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            
            if (count > 1) {
                System.out.println(a[i] + " appears " + count + " times");
            }
        }
    }
}
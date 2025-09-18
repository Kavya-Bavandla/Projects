package Tech_Rostrum;

import java.util.HashSet;
import java.util.Set;

public class Array1issubsetofArray2 {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 2, 9};
        int[] b = {1, 9};
        
        Set<Integer> setA = new HashSet<>();
        for(int num : a) {
            setA.add(num);
        }
        
        boolean isSubset = true;
        for(int num : b) {
            if(!setA.contains(num)) {
                isSubset = false;
                break;
            }
        }
        
        System.out.println(isSubset ? "Is subset" : "Not a subset");
    }


}

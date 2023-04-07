package Task;

import java.util.*;

public class uniqueset {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,3,3,3};
        Set<Integer> uniqueSet = new HashSet<Integer>();
        
        for (int i : arr) {
            uniqueSet.add(i);
        }
        
        System.out.println("Unique elements in the array are:");
        for (int i : uniqueSet) {
            System.out.print(i + " ");
        }
    }
}
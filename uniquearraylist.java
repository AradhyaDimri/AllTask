package Task;

import java.util.ArrayList;
import java.util.HashSet;

public class uniquearraylist {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);

        HashSet<Integer> set = new HashSet<Integer>(list);
        

        ArrayList<Integer> uniqueList = new ArrayList<Integer>(set);
        
        
        System.out.println("Original List: " + list);
        System.out.println("Unique List: " + uniqueList);
    }
}
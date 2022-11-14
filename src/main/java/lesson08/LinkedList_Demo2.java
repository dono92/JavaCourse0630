
package lesson08;

import java.util.LinkedList;

public class LinkedList_Demo2 {
    public static void main(String[] args) {
        
       LinkedList<Integer> s = new LinkedList<>();
      s.add(5);
      s.add(3);
      s.add(4);
      s.add(1);
        System.out.println(s);
        
        for (int i = 0; i < s.size() -1; i++) {
            if (s.get(i) > s.get(i+1)) {
              int temp = s.get(i);
              s.set(i, s.get(i +1));
              s.set(i+1, temp);
                
            }
        }
        System.out.println(s);
        
    }
 
}

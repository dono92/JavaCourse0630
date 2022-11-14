
package lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Demo01 {
    public static void main(String[] args) {
        
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList( 8 , 5, 3, 7, 6, 1, 9, 4, 6, 7));
        System.out.println(scores);
        Collections.sort(scores);
        System.out.println(scores);
        scores.remove(0);
        scores.remove(0);
        scores.remove(scores.size()-1);
        scores.remove(scores.size()-1);
        System.out.println(scores);
        
    }
 
}

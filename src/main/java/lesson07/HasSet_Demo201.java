
package lesson07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class HasSet_Demo201 {
   
        
 // 本期開獎
 private static HashSet<Integer> ans = new HashSet<>(Arrays.asList( 3,34,24,17,32));
 
   public static void main(String[] args) {
        //電腦選號今彩539 (1~39 任意選 5組)
        HashSet <Integer> set = new HashSet<>(); //無順序的陣列
        while (set.size() <5) {
           set.add(new Random().nextInt(39) +1);
           
       }
        
        System.out.println(" 這我買的:" +set);
        System.out.println(" 本期開獎:" +ans);
        
 
        
    }
 
}

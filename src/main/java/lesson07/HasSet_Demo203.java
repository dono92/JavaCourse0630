
package lesson07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class HasSet_Demo203 {
  
    //本期開獎
    private static HashSet<Integer> ans = new HashSet<>(Arrays.asList( 3, 34, 24, 17, 32)); 
   
    public static void main(String[] args) {
        int bet = lotto();
        System.out.println("我中幾注:" + bet);
    }
    
     public static int lotto() {
         //電腦選號今彩539 (1~39    任意選 5組)
         HashSet<Integer> set = new HashSet<>();  //無順序的陣列
         while ( set.size() <5) {
             set.add(new Random().nextInt(39) +1);
             
         }
         System.out.println("這我買的:" + set);
         System.out.println("本期開獎:" + ans);
        
        
        int bet = 0;
         for (Integer i : set) {
             for (Integer a : ans) {
                 if (  i == a) {
                     bet++;
                     System.out.println( i );
                     break;
                 }
                 
             }
         }
        
       return bet;
        
    }
    
}

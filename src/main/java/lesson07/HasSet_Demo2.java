
package lesson07;

import java.util.HashSet;
import java.util.Random;

public class HasSet_Demo2 {
    public static void main(String[] args) {
        
      //電腦選號今彩539(1~39 任意選 5組)
        HashSet<Integer>set = new HashSet<>(); //無順序的陣列
        while(set.size() <5){
            set.add(new  Random().nextInt(39) +1);
            
          }
        System.out.println(set);
        
        }

}

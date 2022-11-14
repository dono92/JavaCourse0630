
package lesson08;

import java.util.LinkedList;
import java.util.Random;


public class LinkedList_Demo {
    public static void main(String[] args) {
        
      LinkedList <Integer> scores = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int score = new Random().nextInt(11); //0~10
            scores.add(score);
            
        }
        System.out.println(scores);
        
        
        
    }
   
}

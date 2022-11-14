
package lesson08;

import java.util.LinkedList;
import java.util.Random;


public class LinkedList_Demo01 {
    public static void main(String[] args) {
        
     LinkedList<Integer> scores = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int score = new Random().nextInt(11); //0~10
            scores.add(score);
        }
        
        System.out.println(scores);
        
        
        int max = 0;
        int min = 10;
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        System.out.println("max : " +max);
        System.out.println("min : " +min);

    }
}

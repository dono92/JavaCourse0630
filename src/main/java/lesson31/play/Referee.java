
package lesson31.play;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;


public class Referee extends Thread {

   static  List<Integer> scores = new ArrayList<>();
    CyclicBarrier cb;
    String tName ;

    public Referee(CyclicBarrier cb, String tName) {
        this.cb = cb;
        this.tName = tName;
        setName(tName);
    }

    @Override
    public void run() {
        System.out.println(tName + " 評分中...");  
        try {
            Thread.sleep(new Random().nextInt(5000));
            int score = new Random().nextInt(100);
            scores.add(score);
            System.out.println(tName + "評分 = " + score);
            cb.await();
        } catch (Exception e) {
        }
        if (tName.equals("60")) {
            double avg = scores.stream().mapToInt(scores -> scores).average().getAsDouble();
            System.out.println(tName + "算得的平均 = " +avg);
            System.out.println(scores);
        }
        
    }
    
   
    
    
    
    
    
    
    
    
    
}

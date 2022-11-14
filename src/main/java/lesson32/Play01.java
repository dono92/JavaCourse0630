
package lesson32;

import java.util.concurrent.CyclicBarrier;


public class Play01 {
    public static void main(String[] args) {
        String[] referees = { "AP", "B", "CK", "Dan", "Ey" };
        int n = referees.length;
        Runnable job = () -> {
            double avg = Referee01.scores.stream().mapToInt(score -> score).average().getAsDouble();
            System.out.println(Thread.currentThread().getName() +  "算得的平均 =" + avg);
            System.out.println(Referee01.scores);
        };
        
        CyclicBarrier cb = new  CyclicBarrier(n, job);
        
        for (String tName : referees) {
            new Referee01(cb, tName).start();
            
        }
        }
    }

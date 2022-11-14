
package lesson31.play;

import java.util.concurrent.CyclicBarrier;


public class play {

    public static void main(String[] args) {
        String[] referees = { "AP", "B", "CK", "Dan", "Ey" };
      int n = referees.length;
        CyclicBarrier cb = new CyclicBarrier(n);
        for (String tName : referees) {
            new Referee(cb, tName)  .start();
            
        }
    }
    
}


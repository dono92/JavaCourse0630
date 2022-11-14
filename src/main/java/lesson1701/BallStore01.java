
package lesson1701;

import java.util.HashSet;
import java.util.Set;

public class BallStore01 {
    public static void main(String[] args) {
       Ball01  b1 = new Ball01("red", 100);
       Ball01 b2 = new Ball01("biue", 200);
       
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.err.println(b1.hashCode());
        System.err.println(b2.hashCode());
        Set balls = new HashSet();
        balls.add(b1);
        balls.add(b2);
        System.out.println(balls);
   
    }
}

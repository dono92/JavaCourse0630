
package lesson23;

import java.util.Random;


public class AssertDemo01 {
    public static void main(String[] args) {
        while (true) {            
            int x =new Random().nextInt(100) +10;
            assert x>= 10 : x +",發生assert error";
            System.out.println(x);
        }
       
    }
}

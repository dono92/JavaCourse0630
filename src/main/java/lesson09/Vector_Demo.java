
package lesson09;

import java.util.Vector;


public class Vector_Demo {
    public static void main(String[] args) {
        
        Vector v = new Vector(); // new Vector(128);
        for (int i = 1; i <= 128; i++) {
            v.add(i*i);
        }
        System.out.println(v);
        System.out.println("Capacity : " +v.capacity());
        System.out.println("Size : " +v.size());
    }
 
}

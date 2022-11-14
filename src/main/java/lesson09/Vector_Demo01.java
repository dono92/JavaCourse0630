
package lesson09;

import java.util.Vector;


public class Vector_Demo01 {
    public static void main(String[] args) {
        Vector v = new Vector(128, 10);  //new Vector(128); 等差級數
        for (int i = 1; i <= 129; i++) {
            v.add(i*i);
        }
        System.out.println(v);
        System.out.println("Capacity : " + v.capacity());
        System.out.println("Size : " + v.size());
    }
  
}

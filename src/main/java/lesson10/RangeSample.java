
package lesson10;

import java.util.stream.IntStream;


public class RangeSample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i); 
      
        }
       IntStream.range(0, 10).forEach(System.out::println);
        
        }
    }



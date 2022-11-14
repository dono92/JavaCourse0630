
package lesson18.Lambda;

import java.util.stream.DoubleStream;


public class LambdaTest301 {
    public static void main(String[] args) {
        
        double[] exams = {100, 90, 80, 70, 60, 50, 40};
        
        DoubleStream.of(exams)
                .filter(x -> x >= 60)
                .mapToInt(x -> (int) (x*1.1))
                .forEach(System.out::println);
        
  
    }
}


package lesson18.Lambda;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;


public class LambdaTest3 {
    public static void main(String[] args) {
      double[] exams = {100, 90, 80, 70, 60, 50, 40};
      
        DoubleStream.of(exams)
                .filter(new DoublePredicate() {
          @Override
          public boolean test(double value) {
             return value >= 60;
             }
                })
       .forEach(new DoubleConsumer() {
          @Override
          public void accept(double value) {
              System.out.println(value);
          }
       });
        
    // Java8
    DoubleStream.of(exams)
            .filter(x -> x >= 60)
            .forEach(System.out::println);
            
   
    }
 
}

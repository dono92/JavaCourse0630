
package lesson19;

import java.util.stream.IntStream;


public class primeDemo02 {
    public static void main(String[] args) {
        // Java7
       //判斷質數
        for (int n = 1; n <= 100; n++) {
            System.out.println( n + (checkPrime(n) ? "是質數" : " "));
        
        }
        
        // Java8
       //判斷質數
        IntStream.rangeClosed(2, 100)
                .filter(x -> checkPrime2(x))
                .forEach(x -> System.out.println(x +"是質數"));
        }
       // Java7
    public static boolean checkPrime(int n) {
        if( n < 2) return false;
        boolean isPrime = true;
        for (int i = 2; i <= n/2 ; i++) {
           if ( n % 1 == 0) {
            isPrime = false;
            break;
        }
      }
        return  isPrime;
    }
    // Java8
    public static boolean checkPrime2(int n) {
        if (n < 2) return false;
        boolean  isPrime = IntStream.rangeClosed(2, n/2).noneMatch(x ->n % x == 0 );
        return isPrime;
   
    }
}


package lesson19;


public class PrimeDemo01 {
    public static void main(String[] args) {
        // Java7
       //判斷質數
        for (int n = 1; n <= 100; n++) {
            System.out.println( n + (checkPrime(n) ? "是質數" : ""));
        }
      }
        
      public static boolean checkPrime(int n) {
          if( n <2 ) return false;
          boolean isPrime = true;
          for (int i = 2; i < n/2; i++) {
              if ( n % 1 == 0 ) {
                  isPrime = false;
                  break;
              }
          }
        return isPrime;
  
    }
}

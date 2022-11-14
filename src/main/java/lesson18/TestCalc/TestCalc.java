
package lesson18.TestCalc;



public class TestCalc {
    public static void main(String[] args) {
    
     Calc c = new Calc() {
         public int call(int x) {
             return  x+x;
         }
     };
        System.out.println(c.call(10));
        show(c);
    }     
        
     
     public static void show(Calc calc) {
         System.out.println(calc.call(10));
         
     }
  }

        
        
        
        
 
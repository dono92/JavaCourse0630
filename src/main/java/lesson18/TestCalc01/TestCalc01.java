
package lesson18.TestCalc01;


public class TestCalc01 {
    public static void main(String[] args) {
        // Jvav7
     Calc c = new Calc() {
         @Override
         public int call(int x) {
            return x+x;
         }
     };
       System.out.println(c.call(10));
      show(c);
      show(new Calc() {
         @Override
         public int call(int x) {
            return x * x;
         }
      });
        System.out.println("-------");
        
        //Java8
        Calc c2 = (int x) -> {return x + x;};
        Calc c3 = (int x) -> x * x;
        Calc c4 = x -> x * x + x ;
        show(c4);
        show(x -> x * x - x);
        
    }
    
    public static void show(Calc calcc){
        System.out.println(calcc.call(10));
     
    }
}

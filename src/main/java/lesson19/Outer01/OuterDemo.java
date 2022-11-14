
package lesson19.Outer01;


public class OuterDemo {
    public static void main(String[] args) {
        Outer01.Inner in = new Outer01().new Inner();
        in.print();
        
        Outer01.SInner sin = new Outer01.SInner();
        sin.print();
        
  
    }
}

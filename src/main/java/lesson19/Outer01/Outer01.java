
package lesson19.Outer01;


public class Outer01 {
    static int sx = 9;
    int x = 7;
    //一般內部類別
    class Inner {
        void print() {
                System.out.println("Hello Inner");
                System.out.println("sx = " + Outer01.sx);
                System.out.println("x = " +Outer01.this.x);
                System.out.println("y = " +Outer01.SInner.y);
        }
    }
    
    //靜態內部類別
    static class SInner {
        static int y = 5;
        static void print(){
            System.out.println("Hello SInner");
            System.out.println("sx = " + Outer01.sx);
            System.out.println("x = " +Outer01.this.x);
            System.out.println("y = " +Outer01.SInner.y);
            
        }
    } 
}

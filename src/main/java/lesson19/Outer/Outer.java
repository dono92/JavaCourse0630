
package lesson19.Outer;

public class Outer {
    
    //一般內部類別
    class Inner {
    void print(){
        System.out.println("Hello Inner");
    }
  }  
    
    //靜態內部類別
    static class SInner {
        static void print(){
            System.out.println("Hello SInner");
        }
               
    } 
 }   


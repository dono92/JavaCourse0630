
package lesson1301;

class A {
  public A (int x) {
      System.out.println("A"+x);
  }
  public A() {
      this(10);
      System.out.println("A");
  }
}

class B extends A {
    public B (int x) {
        super( );
        System.out.println("B"+ x);
    }
    public B() {
        this(8);
        System.out.println("B");
    }
}


public class Extends01 {
    public static void main(String[] args) {
        new B();
    }
}

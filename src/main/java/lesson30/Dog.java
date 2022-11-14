
package lesson30;

    
public class Dog extends Thread {
    private Cookies cookies;
    
    public Dog(Cookies cookies) {
        this.cookies = cookies; 
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= cookies.getNums(); i++) {
                cookies.eat(i);
            }
        } catch (Exception e) {
      }
    }
    
}

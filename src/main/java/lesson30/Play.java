
package lesson30;


public class Play {
    public static void main(String[] args) {
        Cookies cookies = new Cookies(100);
        Master master = new Master(cookies);
        Dog dog =new Dog(cookies);
        master.start();
        dog.start();
                
    }  
}

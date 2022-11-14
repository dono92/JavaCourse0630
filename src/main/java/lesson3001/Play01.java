
package lesson3001;


import lesson30.Cookies;
import lesson30.Dog;
import lesson30.Master;


public class Play01 {
    public static void main(String[] args) {
        Cookies cookies = new Cookies(100);
        Master master = new Master(cookies);
        Dog dog = new Dog(cookies);
        
        Fish fish = new Fish(100);
        Madam madam = new Madam(fish);
        Cat cat = new Cat(fish);
        
        master.start();
        dog.start();
        
        madam.start();
        cat.start();
        
    }
    
    
    
    
    
    
    
    
    
}


package lesson11.case3;

import java.util.ArrayList;
import java.util.List;


public class Test01 {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.move();
        penguin.eat();
        penguin.skill();
        
        // Penguin penguin1 = new Bird();
        
        List<Penguin> zoo1 = new ArrayList<>();
        List<Bird> zoo2 = new ArrayList<>();
        List<Animal> zoo3 = new ArrayList<>();
        zoo3.add(penguin);
    }
 
}

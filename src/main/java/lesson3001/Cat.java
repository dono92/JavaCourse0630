
package lesson3001;

import lesson3001.Fish;


public class Cat extends Thread {
    private Fish fish;
    
    public Cat(Fish fish) {
        this.fish = fish;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= fish.getNums(); i++) {
                fish.eat(i);
               }
            } catch (Exception e) {
            }
    }
}

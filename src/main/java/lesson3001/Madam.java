
package lesson3001;

import lesson3001.Fish;


public class Madam extends Thread {
    private  Fish fish;
    
    public Madam(Fish fish) {
        this.fish = fish;
    }

    @Override
    public void run() {
        
        try {
            for (int i = 1; i <= fish.getNums(); i++) {
                fish.put(i);
            }
        } catch (Exception e) {
        }
    }
            
}
